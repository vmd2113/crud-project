<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/common/taglib.jsp" %>


<section class="container">
    <div class=" row admin-content">

        <%@ include file="/common/admin/menu.jsp" %>

        <div class="admin-information col-9">
            <div class="row">
                <div class="col-12 d-flex">
                    <div class="admin-information__tool-edit ">

                        <a href=""><i class="fa-solid fa-circle-plus" style="color: #ff725e;"></i></a>

                    </div>
                </div>

            </div>
            <div class="row">
                <form class="" action="c:url value='/admin-student'/>">
                    <div class="container">
                        <div class="admin-information__tool d-flex justify-content-between my-3">
                            <table class="table">
                                <thead>
                                <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col"Subject Name></th>
                                    <th scope="col">Subject start day</th>
                                    <th scope="col">Subject end day</th>
                                    <th scope="col"Subject Major Id></th>
                                    <th scope="col"Subject Semester Id></th>

                                    <th scope="col">Edit</th>
                                    <th scope="col">Select <button><i
                                            class="fa-regular fa-square-check"></i></button></th>
                                </tr>
                                </thead>

                                <tbody>
                                <c:forEach var="item" items="${Model.listModel}">

                                    <tr>
                                        <td>${item.Id}</td>
                                        <td>${item.departmentName}</td>
                                        <td>${item.departmentCode}</td>
                                        <td>${item.foundDate}</td>
                                        <td><a href="#"><i class="fa-solid fa-pen-to-square"
                                                           style="color: #ff725e;"></i>
                                        </a></td>
                                        <td>
                                            <c:url var="editURL" value="/admin-department">
                                                <c:param name="type" value="edit"/>
                                                <c:param name="ModelId" value="${item.getId()}"/>
                                            </c:url>
                                            <a href="${editURL}"><i class="fa-solid fa-trash-can" style="color: #ff725e;"></i></a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>

                            </table>
                        </div>






                    </div>


                </form>

            </div>



        </div>



    </div>













    </div>
</section>
