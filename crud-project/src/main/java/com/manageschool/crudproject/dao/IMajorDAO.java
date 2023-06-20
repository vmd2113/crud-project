package com.manageschool.crudproject.dao;

import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.MajorModel;
import com.manageschool.crudproject.paging.IPageable;

import java.util.List;

public interface IMajorDAO extends GenericDAO<MajorModel> {

    List<MajorModel> findAllMajor();
    MajorModel findOneMajorById(long id);

    Long insert(MajorModel categoryModel);
    void update(MajorModel categoryModel);
    void delete(long id);
    List<MajorModel> findAll(IPageable pageble);


    int getTotalItem();


}
