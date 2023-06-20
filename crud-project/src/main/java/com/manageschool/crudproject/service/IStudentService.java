package com.manageschool.crudproject.service;

import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.StudentModel;
import com.manageschool.crudproject.paging.IPageable;

import java.util.List;

public interface IStudentService {

    List<StudentModel> findAllStudentModel();
    StudentModel findOneStudentModelById(long id);


    StudentModel insertStudentModel (StudentModel categoryModel);
    StudentModel updateStudentModel (StudentModel categoryModel);

	void delete(long ids);

    int getTotalItems();
    List<StudentModel> findAll_(IPageable thePage);
}
