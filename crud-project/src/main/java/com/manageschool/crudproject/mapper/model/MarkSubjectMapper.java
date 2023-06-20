package com.manageschool.crudproject.mapper.model;

import com.manageschool.crudproject.mapper.IRowMapper;
import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.MarkSubjectModel;
import com.manageschool.crudproject.model.StudentModel;
import com.manageschool.crudproject.model.SubjectTermModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MarkSubjectMapper implements IRowMapper<MarkSubjectModel> {
    @Override
    public MarkSubjectModel MapRow(ResultSet resultSet) {

        MarkSubjectModel markSubjectModel = new MarkSubjectModel();
        try {
            markSubjectModel.setMark(resultSet.getFloat("Mark"));
            try{
                StudentMapper studentMapper = new StudentMapper();
                StudentModel studentModel = studentMapper.MapRow(resultSet);

                SubjectMapper subjectMapper = new SubjectMapper();
                SubjectTermModel subjectTermModel = subjectMapper.MapRow(resultSet);

                markSubjectModel.setSubjectId((int) subjectTermModel.getId());
                markSubjectModel.setStudentId((int) studentModel.getId());

                return markSubjectModel;


            }catch (Exception e1){
                e1.printStackTrace();

            }
            return markSubjectModel;
        } catch (SQLException e) {
            return null;
        }

    }
}
