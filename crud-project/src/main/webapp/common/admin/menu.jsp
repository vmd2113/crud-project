<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>



<div class="admin-menu col-3 d-flex bg-gradient">
    <div class="div admin-menu__line-decorator">

    </div>
    <div class="div admin-menu__content ">

        <ul class="nav flex-column">
            <li class="nav-item active">

                <a class="nav-link " aria-current="page" href='<c:url value="/admin-home"/>'>Tổng quan</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href='<c:url value="/admin-student?type=list&page=1&maxItemPerPage=5&sortName=StudentId&sortBy=asc"/>'>Sinh viên</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href='<c:url value="/admin-home?type=list&page=1&maxItemPerPage=5&sortName=DepartmentId&sortBy=desc"/>'>Giáo viên</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href='<c:url value="/admin-major?type=list&page=1&maxItemPerPage=5&sortName=MajorId&sortBy=desc"/>'>Ngành</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href='<c:url value="/admin-department?type=list&page=1&maxItemPerPage=5&sortName=DepartmentId&sortBy=desc"/>'>Khoa</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href='<c:url value="/dang-nhap?action=login"/>'>Môn học</a>
            </li>



        </ul>

    </div>

</div>
