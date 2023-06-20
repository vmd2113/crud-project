package com.manageschool.crudproject.mapper.model;

import com.manageschool.crudproject.mapper.IRowMapper;
import com.manageschool.crudproject.mapper.model.DepartmentMapper;
import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.MajorModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MajorMapper implements IRowMapper<MajorModel> {

    @Override
    public MajorModel MapRow(ResultSet resultSet) {
        MajorModel majorModel = new MajorModel();
        try {

            majorModel.setId(resultSet.getLong("MajorId"));
            majorModel.setMajorCode(resultSet.getString("MajorCode"));
            majorModel.setMajorName(resultSet.getString("MajorName"));
            majorModel.setFoundDate(resultSet.getTimestamp("MajorFoundedDate"));
            majorModel.setDepartmentId(resultSet.getLong("DepartmentId"));




            return majorModel;
        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
