package com.manageschool.crudproject.controller.admin;

import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.MajorModel;
import com.manageschool.crudproject.paging.IPageable;
import com.manageschool.crudproject.paging.PageRequest;
import com.manageschool.crudproject.service.IMajorService;
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

@WebServlet({"/admin-major"})
public class AdminMajorController extends HttpServlet {
    @Inject
    private IMajorService majorService;

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        FormUtils formUtils = new FormUtils();
        MajorModel majorModel = formUtils.TransDataToModel(MajorModel.class, request);
//        System.out.println("Sort by: " + majorModel.getSortBy());
//        System.out.println("Type : " + majorModel.getType());
//		System.out.println("Sort name: " + majorModel.getSortName());
//		System.out.println("Page: " +majorModel.getPage() );
//		System.out.println("Max items per page: " + majorModel.getMaxItemPerPage() );
//        majorModel.setListModel(departmentService.findAllDepartmentModel());


        if (majorModel.getType().equals("list")) {
            Sorter categorySorter = new Sorter(majorModel.getSortName(), majorModel.getSortBy());

            IPageable page = new PageRequest(majorModel.getPage(), majorModel.getMaxItemPerPage(), categorySorter);
            List<MajorModel> list = majorService.findAll_(page);

            for (MajorModel majorModel1: list) {
                System.out.println(majorModel1.toString());
            }
            majorModel.setListModel(list);

            int totalPages;
            System.out.println(majorModel.getMaxItemPerPage());
//			System.out.println(majorModel.getTotalItems());
            majorModel.setTotalItems(majorService.getTotalItems());
            System.out.println(" Total items: " + majorModel.getTotalItems());
            totalPages = ((int) Math.ceil((double) majorModel.getTotalItems() / majorModel.getMaxItemPerPage()));
            majorModel.setTotalPages(totalPages);
            System.out.println("totalPage: " + totalPages);
            System.out.println("Sort by: " + majorModel.getTotalPages());

            request.setAttribute("MajorModel", majorModel);
            response.setContentType("text/html; charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            RequestDispatcher rdp = request.getRequestDispatcher("views/admin-model/admin-major.jsp");
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
