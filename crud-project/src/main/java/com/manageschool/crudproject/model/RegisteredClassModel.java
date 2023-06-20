package com.manageschool.crudproject.model;

public class RegisteredClassModel extends AbstractModel<RegisteredClassModel>{

    private Integer StudentId;
    private Integer LectureId;
    private Integer SubjectId;

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public Integer getLectureId() {
        return LectureId;
    }

    public void setLectureId(Integer lectureId) {
        LectureId = lectureId;
    }

    public Integer getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(Integer subjectId) {
        SubjectId = subjectId;
    }
}
