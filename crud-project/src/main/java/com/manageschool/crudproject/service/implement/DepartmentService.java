package com.manageschool.crudproject.service.implement;

import com.manageschool.crudproject.dao.IDepartmentDAO;
import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.paging.IPageable;
import com.manageschool.crudproject.service.IDepartmentService;

import javax.inject.Inject;
import java.util.List;

public class DepartmentService implements IDepartmentService {

    @Inject
    IDepartmentDAO departmentDAO;
    @Override
    public List<DepartmentModel> findAllDepartmentModel() {
        return departmentDAO.findAllDepartment();

    }

    @Override
    public DepartmentModel findOneDepartmentModelById(long id) {
        return departmentDAO.findOneDepartmentById(id);
    }

    @Override
    public DepartmentModel insertDepartmentModel(DepartmentModel departmentModel) {
        Long id = departmentDAO.insert(departmentModel);
        return findOneDepartmentModelById(id);
    }

    @Override
    public DepartmentModel updateDepartmentModel(DepartmentModel departmentModel) {
        DepartmentModel departmentById = departmentDAO.findOneDepartmentById(departmentModel.getId());

        departmentModel.setCreatedDate(departmentById.getCreatedDate());
        departmentModel.setCreatedBy(departmentById.getCreatedBy());
        departmentDAO.update(departmentModel);
        return findOneDepartmentModelById(departmentModel.getId());
    }

    @Override
    public int getTotalItems() {
        return departmentDAO.getTotalItem();
    }

    @Override
    public List<DepartmentModel> findAll_(IPageable thePage) {
        return departmentDAO.findAll(thePage);
    }
}
