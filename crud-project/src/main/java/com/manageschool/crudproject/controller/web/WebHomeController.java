package com.manageschool.crudproject.controller.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet({ "/trang-chu", "/dang-nhap", "/thoat" })
public class WebHomeController extends HttpServlet {
    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");

        if (action != null) {
            if (action.equals("login")) {

                RequestDispatcher rdp = request.getRequestDispatcher("views/login/user-login.jsp");
                rdp.forward(request, response);
            }
            if (action.equals("logout"))
                response.sendRedirect(request.getContextPath() + "/trang-chu");

            else {
                RequestDispatcher rdp = request.getRequestDispatcher("/views/web/web-hompage.jsp");
                rdp.forward(request, response);
            }
        } else {
            RequestDispatcher rdp = request.getRequestDispatcher("/views/web/web-hompage.jsp");

            rdp.forward(request, response);
        }
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher rdp = request.getRequestDispatcher("/views/web/web-hompage.jsp");
        rdp.forward(request, response);
    }


    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher rdp = request.getRequestDispatcher("/views/web/web-hompage.jsp");
        rdp.forward(request, response);
    }

    public void destroy() {
    }
}
