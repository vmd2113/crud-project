package com.manageschool.crudproject.mapper.model;

import com.manageschool.crudproject.mapper.IRowMapper;
import com.manageschool.crudproject.mapper.model.DepartmentMapper;
import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.TeacherModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LecturerMapper  implements IRowMapper<TeacherModel> {
    @Override
    public TeacherModel MapRow(ResultSet resultSet) {
        TeacherModel teacherModel = new TeacherModel();

        try {
            teacherModel.setId(resultSet.getLong("LecturerId"));
            teacherModel.setFullName(resultSet.getString("LecturerFullName"));
            teacherModel.setStatus(resultSet.getInt("LecturerStatus"));
            teacherModel.setDateOfBirth(resultSet.getTimestamp("LecturerDateOfBirth"));
            teacherModel.setDegree(resultSet.getString("LecturerDegree"));
            teacherModel.setAddress((resultSet.getString("LecturerAddress")));
            teacherModel.setGmail(resultSet.getString("LecturerGmail"));
            teacherModel.setPhoneNumber(resultSet.getString("LecturerPhoneNumber"));

            try{
                DepartmentMapper departmentMapper = new DepartmentMapper();
                DepartmentModel departmentModel = departmentMapper.MapRow(resultSet);

                teacherModel.setDepartmentId(departmentModel.getId());
            }catch (Exception e1){
                e1.printStackTrace();

            }
            return teacherModel;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }


    }
}
