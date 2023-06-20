package com.manageschool.crudproject.dao;

import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.TeacherModel;

import java.util.List;

public interface ILecturerDAO extends GenericDAO<TeacherModel> {

    List<DepartmentModel> findAllDepartment();
    DepartmentModel findOneCategoryById(long id);
    DepartmentModel findOneCategoryByCode(String code);

    Long insert(DepartmentModel categoryModel);
    void update(DepartmentModel categoryModel);
    void delete(long id);
    List<DepartmentModel> findAll(DepartmentModel pageble);
    List<DepartmentModel> findAllCategoryByCode(String code, DepartmentModel pageble);

    int getTotalItem();


}
