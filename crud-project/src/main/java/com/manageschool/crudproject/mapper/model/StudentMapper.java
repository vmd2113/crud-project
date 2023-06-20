package com.manageschool.crudproject.mapper.model;



import com.manageschool.crudproject.mapper.IRowMapper;
import com.manageschool.crudproject.model.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper  implements IRowMapper<StudentModel> {
    @Override

    public StudentModel MapRow(ResultSet resultSet) {
        StudentModel studentModel = new StudentModel();

        try {
            studentModel.setId(resultSet.getLong("StudentId"));
            studentModel.setFullName(resultSet.getString("StudentFullName"));
            studentModel.setStatus(resultSet.getInt("StudentStatus"));
            studentModel.setDateOfBirth(resultSet.getTimestamp("StudentDateOfBirth"));
            studentModel.setAddress(resultSet.getString("StudentAddress"));
            studentModel.setGmail(resultSet.getString("StudentGmail"));
            studentModel.setPhoneNumber(resultSet.getString("StudentPhoneNumber"));
            studentModel.setGender(resultSet.getInt("StudentGender"));

            studentModel.setMajorId(resultSet.getLong("MajorId"));
            studentModel.setHomeroomClassId(resultSet.getLong("HomeroomClassId"));




            return studentModel;


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }


    }
}
