package com.manageschool.crudproject.service;

import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.MajorModel;
import com.manageschool.crudproject.paging.IPageable;

import java.util.List;

public interface IMajorService {
    List<MajorModel> findAllMajorModel();

    MajorModel findOneMajorModelById(long id);


    MajorModel insertMajorModel (MajorModel categoryModel);
    MajorModel updateMajorModel (MajorModel categoryModel);

//	void delete(long[] ids);

    int getTotalItems();
    List<MajorModel> findAll_(IPageable thePage);
}
