package com.manageschool.crudproject.model;

import java.sql.Timestamp;

public class DepartmentModel extends AbstractModel<DepartmentModel>{

    private String departmentName;
    private String departmentCode;
    private Timestamp foundDate;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Timestamp getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Timestamp foundDate) {
        this.foundDate = foundDate;
    }
}
