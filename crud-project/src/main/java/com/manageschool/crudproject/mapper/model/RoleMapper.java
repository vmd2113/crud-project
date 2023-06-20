package com.manageschool.crudproject.mapper.model;

import com.manageschool.crudproject.mapper.IRowMapper;
import com.manageschool.crudproject.model.RoleModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleMapper implements IRowMapper<RoleModel> {
    @Override
    public RoleModel MapRow(ResultSet resultSet) {
        RoleModel roleModel = new RoleModel();
        try {
            roleModel.setId(resultSet.getLong("RoleId"));
            roleModel.setCode(resultSet.getString("RoleCode"));
            roleModel.setName(resultSet.getString("RoleName"));

            return roleModel;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        }
    }
}
