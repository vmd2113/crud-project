package com.manageschool.crudproject.model;

import java.sql.Time;
import java.sql.Timestamp;

public class HomeroomClassModel extends AbstractModel<HomeroomClassModel>{

    private String name;
    private Time year;
    private Long lecturerId;
    private Long majorId;

    private Timestamp homeroomClassYear;


    public Long getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(Long lecturerId) {
        this.lecturerId = lecturerId;
    }

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    public Timestamp getHomeroomClassYear() {
        return homeroomClassYear;
    }

    public void setHomeroomClassYear(Timestamp homeroomClassYear) {
        this.homeroomClassYear = homeroomClassYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getYear() {
        return year;
    }

    public void setYear(Time year) {
        this.year = year;
    }


}
