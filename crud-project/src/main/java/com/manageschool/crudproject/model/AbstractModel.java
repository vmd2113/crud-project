package com.manageschool.crudproject.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AbstractModel<T> {

    private long Id;
    private String createdBy;
    private String modifiedBy;

    private Timestamp createdDate;
    private Timestamp ModifiedDate;

    // List of model when get data
    private List<T> listModel = new ArrayList<>();


    // attribute about Pagination.

    private Integer page;
    private Integer maxItemPerPage;
    private Integer totalPages;
    private Integer totalItems;

    private String sortName;
    private String sortBy;

    private String type;






    /**Getter -  setter*/

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    public List<T> getListModel() {
        return listModel;
    }

    public void setListModel(List<T> listModel) {
        this.listModel = listModel;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getMaxItemPerPage() {
        return maxItemPerPage;
    }

    public void setMaxItemPerPage(Integer maxItemPerPage) {
        this.maxItemPerPage = maxItemPerPage;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
