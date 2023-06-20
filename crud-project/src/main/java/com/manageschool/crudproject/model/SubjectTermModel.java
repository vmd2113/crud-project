package com.manageschool.crudproject.model;

import java.sql.Timestamp;

public class SubjectTermModel extends AbstractModel<SubjectTermModel>{

    private String name;
    private Timestamp startDay;
    private Timestamp endDay;

    private Long MajorId;
    private Long SemesterId;

    public Long getMajorId() {
        return MajorId;
    }

    public void setMajorId(Long majorId) {
        MajorId = majorId;
    }

    public Long getSemesterId() {
        return SemesterId;
    }

    public void setSemesterId(Long semesterId) {
        SemesterId = semesterId;
    }

    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getStartDay() {
        return startDay;
    }

    public void setStartDay(Timestamp startDay) {
        this.startDay = startDay;
    }

    public Timestamp getEndDay() {
        return endDay;
    }

    public void setEndDay(Timestamp endDay) {
        this.endDay = endDay;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
