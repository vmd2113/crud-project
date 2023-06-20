package com.manageschool.crudproject.dao.implement;

import com.manageschool.crudproject.dao.GenericDAO;
import com.manageschool.crudproject.mapper.IRowMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class AbstractDAO<T> implements GenericDAO<T> {

    // ResouceBundle được sử dụng để lưu trữ văn bản và đối tượng nhạy cảm với ngôn
    // ngữ. Nói chung, nhằm sử dụng các tệp thuộc tính (cố định) để lưu trữ văn bản
    // cụ
    // thể của ngôn ngữ và sau đó biểu thị chúng bằng đối tượng ResourceBundle.

    ResourceBundle resourceBundle = ResourceBundle.getBundle("database");

    /**
     * Kết nối với cơ sở dữ liệu. Sử dụng: resouceBundle để lấy các thuộc tính như
     * (tên cở sở dữ liệu, url, password, username
     */

    public Connection getConnection() {
        try {
            Class.forName(resourceBundle.getString("driverName"));
            String url = resourceBundle.getString("url");
            String password = resourceBundle.getString("password");
            String username = resourceBundle.getString("user");

            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }

    }

    // cảnh báo rằng: phương thức này đang sử dụng bộ dữ liệu kiểu thô
    @SuppressWarnings("unused")

    private void setParameter(PreparedStatement statement, Object... parameters) {
        try {
            for (int i = 0; i < parameters.length; ++i) {
                Object parameter = parameters[i];
                int index = i + 1;
                if (parameter instanceof Long) {
                    statement.setLong(index, (Long) parameter);
                } else if (parameter instanceof String) {
                    statement.setString(index, (String) parameter);
                } else if (parameter instanceof Integer) {
                    statement.setInt(index, (Integer) parameter);
                } else if (parameter instanceof Timestamp) {
                    statement.setTimestamp(index, (Timestamp) parameter);
                } else if (parameter == null) {
                    statement.setNull(index, Types.NULL);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void closeTransaction(Connection connection, PreparedStatement state, ResultSet result)
            throws SQLException {
        if (connection != null) {
            connection.close();
        }
        if (state != null) {
            state.close();
        }
        if (result != null) {
            result.close();
        }
    }


    @Override
    public <T> List<T> query(String sql, IRowMapper<T> rowMapper, Object... parameters) {
        List<T> result = new ArrayList<>();
        // khai báo
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            setParameter(preparedStatement, parameters);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                // rowMapper sẽ thực hiện binding dữ liệu từ bảng kết quả của resultSet sang
                // thuộc tính của model T rồi List - result sẽ thêm vào
                result.add(rowMapper.MapRow(resultSet));
            }
            return result;


        } catch (Exception e) {
            return null;
        } finally {

            // thực hiện đóng transaction
            try {
                closeTransaction(connection, preparedStatement, resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    // thực hiện xóa - cập nhập dữ liệu cho thực thể

    @Override
    public void update(String sql, Object... parameters) {
        Connection connection = null;
        PreparedStatement statement = null;


        try {
            connection = getConnection();
            connection.setAutoCommit(false);
            // thực hiện lấy ra chuyển đổi câu truy vấn sql - bước chuẩn bị

            statement  = connection.prepareStatement(sql);
            setParameter(statement, parameters);

            statement.executeUpdate();

            connection.commit();


        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException e1) {
                    e.printStackTrace();
                }
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }

    }

    @Override
    public Long insert(String sql, Object... parameters) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        try {
            Long id = null;

            // lấy kết nối với cơ sở dữ liệu
            connection = getConnection();

            // ngăn tự động commit khi thực hiện truy vấn false để ngăn dữ liệu xấu
            connection.setAutoCommit(false);

            // thực hiện lấy ra câu truy vấn
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);


            // gán tham số cho câu truy vấn nếu có
            setParameter(statement, parameters);


            // thực thi câu truy vấn
            statement.executeUpdate();


            // lấy ra kết quả
            result = statement.getGeneratedKeys();

            //lấy ra bảng id
            if (result.next()) {
                id = result.getLong(1);

            }
            connection.commit();
            return id;

        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback();
                }catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            return null;
        }
        finally {
            try {
                closeTransaction(connection, statement, result);
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }

    }


    // thực hiện đếm số phần tử
    @Override
    public int count(String sql, Object... parameters) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;


        try {
            int count_ = 0;
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            setParameter(statement, parameters);
            results = statement.executeQuery();


            while(results.next()) {
                count_ = results.getInt(1);
            }
            return count_;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
        finally {
            try {
                closeTransaction(connection, statement, results);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    @Override
    public void delete_(String sql, Object... parameters) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;

        try {

            connection = getConnection();
            statement = connection.prepareStatement(sql);
            setParameter(statement, parameters);
            int row = statement.executeUpdate();
            System.out.println(row);

        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally {
            try {
                closeTransaction(connection, statement, results);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    ;

}
