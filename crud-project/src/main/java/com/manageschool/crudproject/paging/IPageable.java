package com.manageschool.crudproject.paging;

import com.manageschool.crudproject.sorter.Sorter;

public interface IPageable {

    Integer getNumberOfPage();
    Integer getOffset();
    Integer getLimit();
    Sorter getSorter();
}
