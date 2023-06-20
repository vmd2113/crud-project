package com.manageschool.crudproject.model;

public class ClassCourseModel extends AbstractModel<ClassCourseModel>{
    private Integer LecturerId;
    private Integer StudentId;

    public Integer getLecturerId() {
        return LecturerId;
    }

    public void setLecturerId(Integer lecturerId) {
        LecturerId = lecturerId;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }
}
