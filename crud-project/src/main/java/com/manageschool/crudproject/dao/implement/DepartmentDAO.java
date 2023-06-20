package com.manageschool.crudproject.dao.implement;

import com.manageschool.crudproject.dao.IDepartmentDAO;
import com.manageschool.crudproject.mapper.model.DepartmentMapper;
import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.paging.IPageable;
import org.apache.commons.lang.StringUtils;

import java.awt.print.Pageable;
import java.util.List;

public class DepartmentDAO extends AbstractDAO<DepartmentModel> implements IDepartmentDAO {

    @Override
    public List<DepartmentModel> findAllDepartment() {
        String sql = "SELECT * FROM Department";
        return query(sql, new DepartmentMapper());
    }

    @Override
    public DepartmentModel findOneDepartmentById(long id) {
        String sql = "SELECT * FROM Department WHERE DepartmentId = ?";
        List<DepartmentModel> category_list = query(sql, new DepartmentMapper(), id);
        return category_list.isEmpty() ? null : category_list.get(0);


    }



    @Override
    public Long insert(DepartmentModel departmentModel) {
        String sql = "INSERT INTO Department (DepartmentName, DepartmentCode, DepartmentFoundedDate) VALUES (?, ?, ?)";
        return insert(sql, departmentModel.getDepartmentName(), departmentModel.getDepartmentCode(), departmentModel.getFoundDate());


    }

    @Override
    public void update(DepartmentModel departmentModel) {

        StringBuilder sql = new StringBuilder("UPDATE Department SET DepartmentName = ?, DepartmentCode = ? DepartmentFoundedDate = ?, ");
//		sql.append(" shortdescription = ?, content = ?, categoryid = ?,");
        sql.append("DepartmentCreatedDate = ?, "
                + "DepartmentCreatedBy = ?, "
                + "DepartmentModifiedDate = ?, "
                + "DepartmentModifiedBy = ? "
                + "DepartmentId = ?");
        update(sql.toString(),
                departmentModel.getDepartmentName(),
                departmentModel.getDepartmentCode(),
                departmentModel.getFoundDate(),

                departmentModel.getCreatedDate(),
                departmentModel.getModifiedDate(),
                departmentModel.getCreatedBy(),
                departmentModel.getModifiedBy(),
                departmentModel.getId());
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<DepartmentModel> findAll(IPageable pageble) {

        StringBuilder sql = new StringBuilder("SELECT * FROM Department");
        if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName()) && StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
            sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
        }
        if (pageble.getOffset() != null && pageble.getLimit() != null) {
            sql.append(" LIMIT "+pageble.getOffset()+", "+pageble.getLimit()+"");
        }
        return query(sql.toString(), new DepartmentMapper());
    }




    @Override
    public int getTotalItem() {
        String sql = "SELECT count(*) FROM  Department";
        return count(sql);
    }
}
