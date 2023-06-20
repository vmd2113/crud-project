package com.manageschool.crudproject.mapper;

import java.sql.ResultSet;

public interface IRowMapper <T>{

    T MapRow (ResultSet resultSet);
}
