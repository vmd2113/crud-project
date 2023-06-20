package com.manageschool.crudproject.dao;

import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.paging.IPageable;

import java.awt.print.Pageable;
import java.util.List;

public interface IDepartmentDAO extends GenericDAO<DepartmentModel>{
    List<DepartmentModel> findAllDepartment();
    DepartmentModel findOneDepartmentById(long id);

    Long insert(DepartmentModel categoryModel);
    void update(DepartmentModel categoryModel);
    void delete(long id);
    List<DepartmentModel> findAll(IPageable pageble);


    int getTotalItem();


}
