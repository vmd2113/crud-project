package com.manageschool.crudproject.model;

import java.util.List;

public class StudentModel extends PersonModel {


    private List<StudentModel> studentModelList;

    private Long majorId;
    private Long homeroomClassId;

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    public Long getHomeroomClassId() {
        return homeroomClassId;
    }

    public void setHomeroomClassId(Long homeroomClassId) {
        this.homeroomClassId = homeroomClassId;
    }

    public List<StudentModel> getStudentModelList() {
        return studentModelList;
    }

    public void setStudentModelList(List<StudentModel> studentModelList) {
        this.studentModelList = studentModelList;
    }










}
