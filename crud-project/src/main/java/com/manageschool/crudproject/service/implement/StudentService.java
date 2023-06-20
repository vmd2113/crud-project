package com.manageschool.crudproject.service.implement;

import com.manageschool.crudproject.dao.IStudentDAO;
import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.StudentModel;
import com.manageschool.crudproject.paging.IPageable;
import com.manageschool.crudproject.service.IStudentService;

import javax.inject.Inject;
import java.util.List;

public class StudentService implements IStudentService {


    @Inject
    private IStudentDAO studentDAO;
    @Override
    public List<StudentModel> findAllStudentModel() {
        return studentDAO.findAllStudent();
    }

    @Override
    public StudentModel findOneStudentModelById(long id) {
        return studentDAO.findOneStudentById(id);
    }

    @Override
    public StudentModel insertStudentModel(StudentModel categoryModel) {
        Long id = studentDAO.insert(categoryModel);
        return findOneStudentModelById(id);
    }

    @Override
    public StudentModel updateStudentModel(StudentModel categoryModel) {
        StudentModel studentModel = studentDAO.findOneStudentById(categoryModel.getId());

        studentDAO.update(categoryModel);
        return findOneStudentModelById(studentModel.getId());
    }

    @Override
    public void delete(long ids) {
        studentDAO.delete(ids);
    }

    @Override
    public int getTotalItems() {
        return studentDAO.getTotalItem();
    }

    @Override
    public List<StudentModel> findAll_(IPageable thePage) {
        return studentDAO.findAllStudent(thePage);
    }
}
