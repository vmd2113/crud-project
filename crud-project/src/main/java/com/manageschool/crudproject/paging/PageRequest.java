package com.manageschool.crudproject.paging;

import com.manageschool.crudproject.sorter.Sorter;

public class PageRequest implements IPageable {

    private Integer page;
    private Integer maxItemsPerPage;
    private Sorter sorter;




    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getMaxItemsPerPage() {
        return maxItemsPerPage;
    }

    public void setMaxItemsPerPage(Integer maxItemsPerPage) {
        this.maxItemsPerPage = maxItemsPerPage;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }


    public PageRequest(Integer page, Integer maxPageItem, Sorter sorter) {

        this.page = page;
        this.maxItemsPerPage = maxPageItem;
        this.sorter = sorter;
    }

    @Override
    public Integer getNumberOfPage() {
        return getPage();
    }

    @Override
    public Integer getOffset() {
        if (this.page != null && this.maxItemsPerPage != null) {
            return (this.page - 1) * this.maxItemsPerPage;
        }
        return null;

    }

    @Override
    public Integer getLimit() {
        return getMaxItemsPerPage();
    }

    @Override
    public Sorter getSorter() {
        if (this.sorter != null) {
            return this.sorter;
        }
        return null;
    }
}
