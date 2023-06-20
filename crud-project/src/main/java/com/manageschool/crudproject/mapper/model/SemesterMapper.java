package com.manageschool.crudproject.mapper.model;

import com.manageschool.crudproject.mapper.IRowMapper;
import com.manageschool.crudproject.model.SemesterModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SemesterMapper implements IRowMapper<SemesterModel> {
    @Override
    public SemesterModel MapRow(ResultSet resultSet) {
        SemesterModel semesterModel = new SemesterModel();
        try {
            semesterModel.setId(resultSet.getLong("SemesterId"));
            semesterModel.setName(resultSet.getString("SemesterName"));
            semesterModel.setStartDay(resultSet.getTimestamp("SemesterStartedDay"));
            semesterModel.setEndDay(resultSet.getTimestamp("SemesterEndedDay"));

            return semesterModel;
        } catch (SQLException e) {
            return null;
        }

    }
}
