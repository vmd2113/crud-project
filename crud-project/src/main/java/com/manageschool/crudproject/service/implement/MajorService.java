package com.manageschool.crudproject.service.implement;

import com.manageschool.crudproject.dao.IMajorDAO;
import com.manageschool.crudproject.model.MajorModel;
import com.manageschool.crudproject.paging.IPageable;
import com.manageschool.crudproject.service.IMajorService;

import javax.inject.Inject;
import java.util.List;

public class MajorService implements IMajorService {
    @Inject
    private IMajorDAO majorDAO;
    @Override
    public List<MajorModel> findAllMajorModel() {
        return majorDAO.findAllMajor();
    }

    @Override
    public MajorModel findOneMajorModelById(long id) {
        return majorDAO.findOneMajorById(id);
    }

    @Override
    public MajorModel insertMajorModel(MajorModel categoryModel) {
        return null;
    }

    @Override
    public MajorModel updateMajorModel(MajorModel categoryModel) {
        return null;
    }

    @Override
    public int getTotalItems() {
       return majorDAO.getTotalItem();
    }

    @Override
    public List<MajorModel> findAll_(IPageable thePage) {
        return majorDAO.findAll(thePage);
    }
}
