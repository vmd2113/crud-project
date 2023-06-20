<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/common/taglib.jsp" %>


<section class="container">
    <div class=" row admin-content">

        <%@ include file="/common/admin/menu.jsp" %>

        <div class="admin-information col-9">
            <div class="row">
                <div class="col-12 d-flex">

                    <div class="admin-information_tool-search">

                        <form action="" class="d-flex flex-row form-search">
                            <input class="input-search" placeholder="Tìm kiếm">
                            <button type="button">Tìm kiếm</button>

                        </form>

                    </div>

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
                                    <th scope="col">FullName</th>

                                    <th scope="col">Date of birth</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Gmail</th>
                                    <th scope="col">PhoneNumber</th>
                                    <th scope="col">Status</th>
                                    <th scope="col">Gender</th>
                                    <th scope="col">Degree</th>



                                    <th scope="col">Edit</th>
                                    <th scope="col">Select <button><i
                                            class="fa-regular fa-square-check"></i></button></th>
                                </tr>
                                </thead>

                                <tbody>
                                <c:forEach var="item" items="${Model.listModel}">

                                    <tr>
                                        <td>${item.getId()}</td>
                                        <td>${item.fullName}</td>
                                        <td>${item.dateOfBirth}</td>
                                        <td>${item.address}</td>
                                        <td>${item.gmail}</td>
                                        <td>${item.phoneNumber}</td>
                                        <td>${item.status}</td>
                                        <td>${item.gender}</td>
                                        <td>${item.degree}</td>

                                        <td><a href="#"><i class="fa-solid fa-pen-to-square"
                                                           style="color: #ff725e;"></i>
                                        </a></td>
                                        <td>
                                            <c:url var="editURL" value="/admin-department">
                                                <c:param name="type" value="edit"/>
                                                <c:param name="id" value="${item.getId()}"/>
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
