package com.manageschool.crudproject.model;

public class MarkSubjectModel {

    private Float mark;
    private Integer StudentId;
    private Integer SubjectId;

    public Float getMark() {
        return mark;
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public Integer getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(Integer subjectId) {
        SubjectId = subjectId;
    }
}
