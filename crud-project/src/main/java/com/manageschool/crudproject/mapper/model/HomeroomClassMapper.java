package com.manageschool.crudproject.mapper.model;

import com.manageschool.crudproject.mapper.IRowMapper;
import com.manageschool.crudproject.model.HomeroomClassModel;
import com.manageschool.crudproject.model.MajorModel;
import com.manageschool.crudproject.model.TeacherModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HomeroomClassMapper implements IRowMapper<HomeroomClassModel> {


    @Override
    public HomeroomClassModel MapRow(ResultSet resultSet) {
        HomeroomClassModel homeroomClassModel = new HomeroomClassModel();


        try {
            homeroomClassModel.setId(resultSet.getLong("HomeroomClassId"));
            homeroomClassModel.setName(resultSet.getString("HomeroomClassName"));
            homeroomClassModel.setYear(resultSet.getTime("HomeroomClassYear"));

            try{
                MajorMapper majorMapper = new MajorMapper();
                MajorModel majorModel = majorMapper.MapRow(resultSet);

                LecturerMapper lecturerMapper = new LecturerMapper();
                TeacherModel teacherModel = lecturerMapper.MapRow(resultSet);

                homeroomClassModel.setMajorId(majorModel.getId());
                homeroomClassModel.setLecturerId(teacherModel.getId());


            }catch (Exception e1){
                e1.printStackTrace();

            }
            return homeroomClassModel;

        }catch (SQLException e){
            e.printStackTrace();
            return null;


        }



    }
}
