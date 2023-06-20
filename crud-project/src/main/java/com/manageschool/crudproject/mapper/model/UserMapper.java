package com.manageschool.crudproject.mapper.model;

import com.manageschool.crudproject.mapper.IRowMapper;
import com.manageschool.crudproject.mapper.model.RoleMapper;
import com.manageschool.crudproject.model.RoleModel;
import com.manageschool.crudproject.model.UserModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements IRowMapper<UserModel> {
    @Override
    public UserModel MapRow(ResultSet resultSet) {
        UserModel userModel = new UserModel();
        try {
            userModel.setId(resultSet.getLong("UserId"));
            userModel.setUserName(resultSet.getString("Username"));
            userModel.setPassword(resultSet.getString("UserPassword"));
            userModel.setFullName(resultSet.getString("UserFullName"));
            userModel.setStatus(resultSet.getInt("UserStatus"));
            try {
                RoleMapper roleMapper = new RoleMapper();
                RoleModel role = roleMapper.MapRow(resultSet);
                userModel.setRole(role);
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
            return userModel;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
