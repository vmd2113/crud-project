package com.manageschool.crudproject.utils;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;

public class FormUtils {

    public <T> T TransDataToModel(Class<T> classReceived, HttpServletRequest request){
        T object = null;

        try{
            object = classReceived.newInstance();
            BeanUtils.populate(object, request.getParameterMap());

        } catch (InstantiationException |IllegalAccessException |InvocationTargetException e) {
            System.out.println(e.getMessage());

        }
        return object;
    }
}
