package com.manageschool.crudproject.model;

import java.sql.Timestamp;

public class MajorModel extends AbstractModel<MajorModel>{

    private String majorName;
    private String majorCode;
    private Long departmentId;
    private Timestamp foundDate;

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Timestamp getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Timestamp foundDate) {
        this.foundDate = foundDate;
    }
}

