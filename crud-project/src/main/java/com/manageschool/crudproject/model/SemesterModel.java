package com.manageschool.crudproject.model;

import java.sql.Timestamp;

public class SemesterModel extends AbstractModel<SemesterModel>{
    private String name;
    private Timestamp startDay;
    private Timestamp endDay;

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
}
