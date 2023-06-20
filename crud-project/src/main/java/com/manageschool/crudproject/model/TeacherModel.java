package com.manageschool.crudproject.model;


public class TeacherModel extends PersonModel{
    private String degree;
    private Long DepartmentId;

    public Long getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(Long departmentId) {
        DepartmentId = departmentId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
