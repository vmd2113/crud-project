package com.manageschool.crudproject.dao;

import com.manageschool.crudproject.mapper.IRowMapper;

import java.util.List;

public interface GenericDAO<T> {

    <T> List<T> query(String sql, IRowMapper<T> rowMapper, Object... parameters);
    void update (String sql, Object... parameters);
    Long insert (String sql, Object... parameters);
    int count(String sql, Object... parameters);

    void delete_(String sql,    Object... parameters);
}
