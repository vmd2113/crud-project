<%--
  Created by IntelliJ IDEA.
  User: Duong
  Date: 6/10/2023
  Time: 6:50 AM
  To change this template use File | Settings | File Templates.
--%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>


<!DOCTYPE html>
<html lang="en">
<meta charset="utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
<meta name="description" content=""/>
<meta name="author" content=""/>
<title><dec:title default="Trang chủ"/></title>

<!-- Core theme CSS (includes Bootstrap)-->
<link href="<c:url value='/template/bootstrap-5.0.2/dist/css/bootstrap.css'/>" rel="stylesheet "/>
<link rel="preconnect" href=<c:url value='https://fonts.googleapis.com'/>/>
<link rel="preconnect" href=<c:url value='https://fonts.gstatic.com" crossorigin'/>/>
<link href=<c:url value='https://fonts.googleapis.com/css2?family=Quicksand:wght@400;600;700&display=swap'/> rel="stylesheet">
<!-- main css -->
<link href="<c:url value='/template/web-homepage/css/web-homepage.css' />" rel="stylesheet" />
</head>


<body>
<!-- header -->
    <%@ include file="/common/web/header.jsp" %>
    <dec:body/>
<!-- Footer-->
    <%@ include file="/common/web/footer.jsp" %>

<!-- Core theme JS-->

    <script src="<c:url value='/template/bootstrap-5.0.2/dist/js/bootstrap.bundle.js'/>"></script>
    <script src="<c:url value='/template/web-homepage/js/web-homepage.js'/>"></script>
    <script src="<c:url value='https://code.jquery.com/jquery-3.5.1.min.js'/>"></script>
    <script>
    $('.count').each(function () {
        $(this).prop('Counter', 0).animate({
            Counter: $(this).text()
        }, {
            duration: 3000,
            easing: 'swing',
            step: function (now) {
                $(this).text(Math.ceil(now));
            }
        });
    });
    </script>
</body>
</html>
