package com.manageschool.crudproject.service;

import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.paging.IPageable;

import java.util.List;

public interface IDepartmentService {
    List<DepartmentModel> findAllDepartmentModel();

    DepartmentModel findOneDepartmentModelById(long id);


    DepartmentModel insertDepartmentModel (DepartmentModel categoryModel);
    DepartmentModel updateDepartmentModel (DepartmentModel categoryModel);

//	void delete(long[] ids);

    int getTotalItems();
    List<DepartmentModel> findAll_(IPageable thePage);
}
