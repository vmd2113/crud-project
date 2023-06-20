package com.manageschool.crudproject.dao;

import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.StudentModel;
import com.manageschool.crudproject.paging.IPageable;

import java.util.List;

public interface IStudentDAO extends GenericDAO<StudentModel> {

    List<StudentModel> findAllStudent();
    StudentModel findOneStudentById(long id);
    Long insert(StudentModel  studentModel);
    void update(StudentModel  studentModel);
    void delete(long id);

    List<StudentModel> findAllStudent(IPageable pageble);

    List<StudentModel> findAllStudentInMajor(IPageable pageble);

    int getTotalItem();


}
