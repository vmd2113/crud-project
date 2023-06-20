
<%--
  Created by IntelliJ IDEA.
  User: Duong
  Date: 6/10/2023
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<section class="login-section">
    <div class="container">

        <div class="row">
            <div class="col-6">
                <img class="img-fluid" src=<c:url value='/template/login/img/Formula-pana.svg'/> alt="có thể đây là hình ảnh cô giáo và hình ảnh công thức">

            </div>

            <div class="col-6 login-content d-flex justify-content-center align-items-center flex-column">
                <img src=<c:url value='/template/login/img/logo-ngang.webp'/>
                             alt = "đây có thể là logo của trường đại học công nghiệp">
                <form class="form-login" action="">
                    <div class="login-username">
                        <input class="my-2" type="text" placeholder="Tên đăng nhập" name="userName" id="userName">
                        <span class="row mb-4 mx-3 helper-text text-danger " id="userNameError"></span>
                    </div>
                    <div class="login-password">
                        <input class="line" type="password" placeholder="Mật khẩu" name="password" id="password">
                        <span class=" row mb-4 mx-3 helper-text text-danger" id="passwordError"></span>
                    </div>

                    <button class="login-submit my-3" id='login-submit' type="submit">Đăng nhập</button>
                </form>

            </div>
        </div>
    </div>


</section>

</body>
</html>
