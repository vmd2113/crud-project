package com.manageschool.crudproject.controller.admin;

import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.paging.IPageable;
import com.manageschool.crudproject.paging.PageRequest;
import com.manageschool.crudproject.service.IDepartmentService;
import com.manageschool.crudproject.sorter.Sorter;
import com.manageschool.crudproject.utils.FormUtils;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/admin-department"})
public class AdminDepartmentController extends HttpServlet {

    @Inject
    private IDepartmentService departmentService;


    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

//        List<DepartmentModel> departmentModels = departmentService.findAllDepartmentModel();
//
//        for (DepartmentModel departmentModel: departmentModels){
//            System.out.println(departmentModel.toString());
//        }
//
//        request.setAttribute("ListDepartment", departmentModels);
//        response.setContentType("text/html; charset=UTF-8");
//        request.setCharacterEncoding("UTF-8") ;


        FormUtils formUtils = new FormUtils();
        DepartmentModel departmentModel = formUtils.TransDataToModel(DepartmentModel.class, request);
//        System.out.println("Sort by: " + departmentModel.getSortBy());
//        System.out.println("Type : " + departmentModel.getType());
//		System.out.println("Sort name: " + departmentModel.getSortName());
//		System.out.println("Page: " +departmentModel.getPage() );
//		System.out.println("Max items per page: " + departmentModel.getMaxItemPerPage() );
//        departmentModel.setListModel(departmentService.findAllDepartmentModel());


        if (departmentModel.getType().equals("list")) {
            Sorter categorySorter = new Sorter(departmentModel.getSortName(), departmentModel.getSortBy());

            IPageable page = new PageRequest(departmentModel.getPage(), departmentModel.getMaxItemPerPage(), categorySorter);
            List<DepartmentModel> list = departmentService.findAll_(page);

            for (DepartmentModel departmentModel_: list){
                System.out.println(departmentModel_.toString());
            }
            departmentModel.setListModel(list);
            int totalPages;
            System.out.println(departmentModel.getMaxItemPerPage());
//			System.out.println(departmentModel.getTotalItems());
            departmentModel.setTotalItems(departmentService.getTotalItems());
            System.out.println(" Total items: " + departmentModel.getTotalItems());
            totalPages = ((int) Math.ceil((double) departmentModel.getTotalItems() / departmentModel.getMaxItemPerPage()));
            departmentModel.setTotalPages(totalPages);
            System.out.println("totalPage: " + totalPages);
            System.out.println("Sort by: " + departmentModel.getTotalPages());

            request.setAttribute("DepartmentModel", departmentModel);
            response.setContentType("text/html; charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            RequestDispatcher rdp = request.getRequestDispatcher("views/admin-model/admin-department.jsp");
            rdp.forward(request, response);




        }


    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }


    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }

    public void destroy() {
    }

}
