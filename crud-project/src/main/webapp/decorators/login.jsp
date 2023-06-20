<%--
  Created by IntelliJ IDEA.
  User: Duong
  Date: 4/26/2023
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <title><dec:title default="Trang chủ" /></title>



  <link rel="preconnect" href=<c:url value='https://fonts.googleapis.com'/>/>
  <link rel="preconnect" href=<c:url value='https://fonts.gstatic.com" crossorigin'/>/>
  <link href=<c:url value='https://fonts.googleapis.com/css2?family=Quicksand:wght@400;600;700&display=swap'/> rel="stylesheet">
  <!-- Core theme CSS (includes Bootstrap)-->
  <link href="<c:url value='/template/bootstrap-5.0.2/dist/css/bootstrap.css'/>" rel="stylesheet "/>
  <link href="<c:url value='/template/login/css/login.css' />" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>

<!-- header -->


<dec:body/>


<!-- Footer-->


<!-- Bootstrap core JS-->

<!-- Core theme JS-->
<script src="<c:url value='/template/bootstrap-5.0.2/dist/js/bootstrap.bundle.js'/>"></script>
<script src="<c:url value='/template/login/js/login.js'/>"></script>
</body>
</html>

