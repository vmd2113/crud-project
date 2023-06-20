package com.manageschool.crudproject.mapper.model;

import com.manageschool.crudproject.mapper.IRowMapper;
import com.manageschool.crudproject.model.DepartmentModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentMapper implements IRowMapper<DepartmentModel> {

    @Override
    public DepartmentModel MapRow(ResultSet resultSet) {

        DepartmentModel departmentModel = new DepartmentModel();
        try {

            departmentModel.setId(resultSet.getLong("DepartmentId"));
            departmentModel.setDepartmentCode(resultSet.getString("DepartmentCode"));
            departmentModel.setDepartmentName(resultSet.getString("DepartmentName"));
            departmentModel.setFoundDate(resultSet.getTimestamp("DepartmentFoundedDate"));

            return departmentModel;
        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
