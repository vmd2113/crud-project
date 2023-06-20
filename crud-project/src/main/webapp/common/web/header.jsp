<%--
  Created by IntelliJ IDEA.
  User: Duong
  Date: 6/10/2023
  Time: 6:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<header class="">
    <nav class="navbar navbar-expand-lg container">
        <div class="container-fluid">
            <a class="navbar-brand" href="#"></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">


                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Trang chủ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="404error.html">Tuyển sinh</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="404error.html">Tin tức</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="404error.html">Thông báo</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href='<c:url value="/dang-nhap?action=login"/>'>Đăng nhập</a>
                    </li>

                    <c:if test="${not empty MODEL_LOGIN}">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Username
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item text-black-50" href="#">Thông tin cá nhân</a></li>
                                <li><a class="dropdown-item text-black-50 " href="#">Bảng điểm</a></li>

                                <li class="dropdown-item text-black-50">
                                    <a class="nav-link" href='<c:url value="/dang-nhap?action=logout"/>'>Thoát</a>
                                </li>
                                <!-- <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="#">Something else here</a></li> -->
                            </ul>
                        </li>
                    </c:if>


                    <!-- <li class="nav-item">
                        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                    </li> -->
                </ul>

                <div class="logo-header">
                    <img class=" img-fluid" src=<c:url value='/template/web-homepage/img/logo/logo-ngang%20(1).webp'/> alt="">
                </div>


            </div>
        </div>
    </nav>

</header>
