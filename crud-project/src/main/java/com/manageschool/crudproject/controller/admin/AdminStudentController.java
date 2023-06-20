package com.manageschool.crudproject.controller.admin;

import com.manageschool.crudproject.dao.IStudentDAO;
import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.PersonModel;
import com.manageschool.crudproject.model.StudentModel;
import com.manageschool.crudproject.paging.IPageable;
import com.manageschool.crudproject.paging.PageRequest;
import com.manageschool.crudproject.service.IStudentService;
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
import java.sql.Timestamp;
import java.time.format.SignStyle;
import java.util.List;


@WebServlet({"/admin-student"})
public class AdminStudentController extends HttpServlet {

    @Inject
    private IStudentService iStudentService;

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<StudentModel> studentModelList = iStudentService.findAllStudentModel();


//
        for (StudentModel departmentModel: studentModelList){
            System.out.println(departmentModel.toString());
        }

//        StudentModel testStudentModel = new StudentModel();
//
//        testStudentModel.setFullName("ABC");
//        testStudentModel.setAddress("A");
//        testStudentModel.setGmail("ABC");
//        testStudentModel.setPhoneNumber("A");
//        testStudentModel.setGender(1);
//        testStudentModel.setStatus(1);
//
//        testStudentModel.setMajorId(1L);
//        testStudentModel.setHomeroomClassId(1L);
//        testStudentModel.setDateOfBirth(Timestamp.valueOf("2001-01-01 00:00:00"));
//
//        StudentModel a = iStudentService.findOneStudentModelById(38);
//        a.setFullName("AAAAAAAAAAAAAAAAAAAAAA");
//        a = iStudentService.updateStudentModel(a);








        FormUtils formUtils = new FormUtils();
        StudentModel studentModel = formUtils.TransDataToModel(StudentModel.class, request);
        System.out.println(studentModel.toString());
//        System.out.println("Sort by: " + departmentModel.getSortBy());
//        System.out.println("Type : " + departmentModel.getType());
//		System.out.println("Sort name: " + departmentModel.getSortName());
//		System.out.println("Page: " +departmentModel.getPage() );
//		System.out.println("Max items per page: " + departmentModel.getMaxItemPerPage() );
//       departmentModel.setListModel(departmentService.findAllDepartmentModel());


        if (studentModel.getType().equals("list")) {
            Sorter categorySorter = new Sorter(studentModel.getSortName(), studentModel.getSortBy());

            IPageable page = new PageRequest(studentModel.getPage(), studentModel.getMaxItemPerPage(), categorySorter);
            List<StudentModel> list = iStudentService.findAll_(page);

            for (StudentModel studentModel1 : list) {
                System.out.println(studentModel1.toString());
                System.out.println(studentModel1.getMajorId());
            }
            studentModel.setStudentModelList(list);
            int totalPages;
            System.out.println(studentModel.getMaxItemPerPage());
//			System.out.println(departmentModel.getTotalItems());
            studentModel.setTotalItems(iStudentService.getTotalItems());
            System.out.println(" Total items: " + studentModel.getTotalItems());
            totalPages = ((int) Math.ceil((double) studentModel.getTotalItems() / studentModel.getMaxItemPerPage()));
            studentModel.setTotalPages(totalPages);
            System.out.println("totalPage: " + totalPages);
            System.out.println("Sort by: " + studentModel.getTotalPages());

            request.setAttribute("StudentModel", studentModel);
            response.setContentType("text/html; charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            RequestDispatcher rdp = request.getRequestDispatcher("views/admin-model/admin-student.jsp");
            rdp.forward(request, response);
        }

        if (studentModel.getType().equals("edit")){
            String idGet = request.getParameter("ModelId");


            System.out.println(idGet);
            if (idGet.isEmpty()){
                StudentModel studentModel1 = new StudentModel();
                request.setAttribute("CurrentStudent", studentModel1);
                RequestDispatcher rdp = request.getRequestDispatcher("views/admin-action/action-student.jsp");
                rdp.forward(request, response);



            }else{
                long id = Long.parseLong(idGet);
                StudentModel studentModel1 = iStudentService.findOneStudentModelById(id);
                request.setAttribute("CurrentStudent", studentModel1);
                RequestDispatcher rdp = request.getRequestDispatcher("views/admin-action/action-student.jsp");
                rdp.forward(request, response);


            }




        }

        if (studentModel.getType().equals("delete")){
            String idGet = request.getParameter("ModelId");
            System.out.println(idGet);
            long id = Long.parseLong(idGet);
            StudentModel studentModel1 = iStudentService.findOneStudentModelById(id);
            iStudentService.delete(id);
            System.out.println(studentModel1.toString());
            RequestDispatcher rdp = request.getRequestDispatcher("template/Success.jsp");
            rdp.forward(request, response);







        }

    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        FormUtils formUtils = new FormUtils();
        StudentModel studentModel = formUtils.TransDataToModel(StudentModel.class, request);
        if (studentModel.getType().equals("edit")) {
            String idGet = request.getParameter("ModelId");
            System.out.println(idGet);


            if (idGet.isEmpty()) {
                StudentModel studentModel1 = new StudentModel();
                request.setAttribute("CurrentStudent", studentModel1);


                String name = request.getParameter("ModelName");
                String date = request.getParameter("ModelDateOfBirth") + " 00:00:00";
                String address = request.getParameter("ModelAddress");
                String phoneNumber = request.getParameter("ModelPhoneNumber");
                String gmail = request.getParameter("ModelGmail");
                String gender = request.getParameter("ModelGender");
                String status = request.getParameter("ModelStatus");

                System.out.println(name + " " + date + " " + address + " " + phoneNumber + " "
                        + gmail + " " + gender + " " + status + " ");
                StudentModel studentModel_ = Process(name, phoneNumber, gmail, gender, status, address, date);
                studentModel1 = iStudentService.insertStudentModel(studentModel_);
                System.out.println(studentModel1.getId());


                RequestDispatcher rdp = request.getRequestDispatcher("views/admin-action/action-student.jsp");
                rdp.forward(request, response);


            } else {
                long id = Long.parseLong(idGet);
                StudentModel studentModel1 = iStudentService.findOneStudentModelById(id);

                String name = request.getParameter("ModelName");
                String date = request.getParameter("ModelDateOfBirth") + "00:00:00";
                String address = request.getParameter("ModelAddress");
                String phoneNumber = request.getParameter("ModelPhoneNumber");
                String gmail = request.getParameter("ModelGmail");
                String gender = request.getParameter("ModelGender");
                String status = request.getParameter("ModelStatus");

                System.out.println(name + " " + date + " " + address + " " + phoneNumber + " "
                        + gmail + " " + gender + " " + status + " ");
                StudentModel studentModel__ = Process(name, phoneNumber, gmail, gender, status, address, date);
                studentModel1 = iStudentService.updateStudentModel(studentModel__);
                request.setAttribute("CurrentStudent", studentModel1);
                RequestDispatcher rdp = request.getRequestDispatcher("views/admin-action/action-student.jsp");
                rdp.forward(request, response);


            }

        }
    }


    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }

    public void destroy() {
    }

    private StudentModel Process (String name, String phone, String gmail, String gender, String status, String address, String date){
        if(!name.equals("") && !phone.equals("") && !gender.equals("") && !gmail.equals("") && !status.equals("") && !address.equals("")&& !date.equals("") ){
            StudentModel studentModel = new StudentModel();
            studentModel.setFullName(name);
            studentModel.setGmail(gmail);
            studentModel.setPhoneNumber(phone);
            studentModel.setAddress(address);

            studentModel.setStatus(Integer.parseInt(status));
            studentModel.setStatus(Integer.parseInt(gender));
            Timestamp timestamp = Timestamp.valueOf(date);
            studentModel.setDateOfBirth(timestamp);
            studentModel.setMajorId(1L);
            studentModel.setHomeroomClassId(1L);
            return studentModel;
        }
        return  null;
    }
}
