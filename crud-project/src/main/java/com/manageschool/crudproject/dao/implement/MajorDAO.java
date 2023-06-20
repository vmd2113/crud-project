package com.manageschool.crudproject.dao.implement;

import com.manageschool.crudproject.dao.GenericDAO;
import com.manageschool.crudproject.dao.IMajorDAO;

import com.manageschool.crudproject.mapper.model.MajorMapper;
import com.manageschool.crudproject.model.MajorModel;
import com.manageschool.crudproject.paging.IPageable;
import org.apache.commons.lang.StringUtils;

import java.util.List;

public class MajorDAO extends AbstractDAO<MajorModel> implements IMajorDAO{
    @Override
    public List<MajorModel> findAllMajor() {
        String sql = "SELECT * FROM Department";
        return query(sql, new MajorMapper());
    }

    @Override
    public MajorModel findOneMajorById(long id) {
        String sql = "SELECT * FROM Department WHERE MajorId = ?";
        List<MajorModel> category_list = query(sql, new MajorMapper(), id);
        return category_list.isEmpty() ? null : category_list.get(0);
    }

    @Override
    public Long insert(MajorModel categoryModel) {
        return null;
    }

    @Override
    public void update(MajorModel categoryModel) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<MajorModel> findAll(IPageable pageble) {
        StringBuilder sql = new StringBuilder("SELECT * FROM Major");
        if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName()) && StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
            sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
        }
        if (pageble.getOffset() != null && pageble.getLimit() != null) {
            sql.append(" LIMIT "+pageble.getOffset()+", "+pageble.getLimit()+"");
        }
        return query(sql.toString(), new MajorMapper());
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT count(*) FROM  Major";
        return count(sql);
    }
}
