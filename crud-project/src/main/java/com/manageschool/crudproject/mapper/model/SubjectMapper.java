package com.manageschool.crudproject.mapper.model;

import com.manageschool.crudproject.mapper.IRowMapper;
import com.manageschool.crudproject.mapper.model.MajorMapper;
import com.manageschool.crudproject.mapper.model.SemesterMapper;
import com.manageschool.crudproject.model.MajorModel;
import com.manageschool.crudproject.model.SemesterModel;
import com.manageschool.crudproject.model.SubjectTermModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubjectMapper implements IRowMapper<SubjectTermModel> {
    @Override
    public SubjectTermModel MapRow(ResultSet resultSet) {
        SubjectTermModel subjectTermModel = new SubjectTermModel();
        try {
            subjectTermModel.setId(resultSet.getLong("SubjectId"));
            subjectTermModel.setName(resultSet.getString("SubjectName"));
            subjectTermModel.setCode(resultSet.getString("SubjectCode"));

            subjectTermModel.setStartDay(resultSet.getTimestamp("SubjectStartedDay"));
            subjectTermModel.setEndDay(resultSet.getTimestamp("SubjectEndedDay"));


            try{
                SemesterMapper semesterMapper = new SemesterMapper();
                SemesterModel semesterModel = semesterMapper.MapRow(resultSet);
                subjectTermModel.setSemesterId(semesterModel.getId());

                MajorMapper majorMapper = new MajorMapper();
                MajorModel majorModel = majorMapper.MapRow(resultSet);
                subjectTermModel.setMajorId(majorModel.getId());


            }catch (Exception e1){

            }
            return subjectTermModel;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
