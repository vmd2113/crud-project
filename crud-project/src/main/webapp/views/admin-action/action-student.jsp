<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="/common/taglib.jsp" %>

<body>
<section class="container">
    <div class=" row admin-content">

        <%@ include file="/common/admin/menu.jsp" %>
        <div class="admin-information col-9">

            <div class="container">
                <form action="<c:url value='/admin-student'/>" class="form-edit" method="POST">
                    <div class=" row">

                        <div class="form-item row">
                            <div class="col-2 form-item-name">
                                <span>FullName</span>

                            </div>
                            <div class="col-10 form-item-data">
                                <input type="text" placeholder="${CurrentStudent.getFullName()}" name="ModelName">

                            </div>

                        </div>

                        <div class="form-item row">
                            <div class="col-2 form-item-name">
                                <span>DateOfBirth</span>

                            </div>
                            <div class="col-10 form-item-data">
                                <input type="date" placeholder="${CurrentStudent.getDateOfBirth()}" name="ModelDateOfBirth">

                            </div>

                        </div>

                        <div class="form-item row">
                            <div class="col-2 form-item-name">
                                <span>Address</span>

                            </div>
                            <div class="col-10 form-item-data">
                                <input type="text" placeholder="${CurrentStudent.getAddress()}" name="ModelAddress">

                            </div>
                        </div>


                        <div class="form-item row">
                            <div class="col-2 form-item-name">
                                <span>Gmail</span>

                            </div>
                            <div class="col-10 form-item-data">
                                <input type="text" placeholder="${CurrentStudent.getGmail()}" name="ModelGmail">

                            </div>
                        </div>

                        <div class="form-item row">
                            <div class="col-2 form-item-name">
                                <span>PhoneNumber</span>

                            </div>
                            <div class="col-10 form-item-data">
                                <input type="text" placeholder="${CurrentStudent.getPhoneNumber()}" name="ModelPhoneNumber">

                            </div>
                        </div>

                        <div class="form-item row">
                            <div class="col-2 form-item-name">
                                <span>Major Id</span>

                            </div>
                            <div class="col-10 form-item-data">
                                <input type="text" placeholder="${CurrentStudent.getMajorId()}" name="ModelPhoneNumber">

                            </div>
                        </div>


                        <div class="form-item row">
                            <div class="col-2 form-item-name">
                                <span>HomeClassId</span>

                            </div>
                            <div class="col-10 form-item-data">
                                <input type="text" placeholder="${CurrentStudent.getPhoneNumber()}" name="ModelPhoneNumber">

                            </div>
                        </div>


                        <div class="form-item row">
                            <div class="col-2 form-item-name">
                                <span>Gender</span>

                            </div>

                            <div class="col-10 form-item-data">
                                <select name="ModelGender">

                                    <c:if test="${not empty CurrentStudent.getId()}">
                                        <option value="">Select Gender</option>
                                        <c:if test="${CurrentStudent.getGender()==1}">
                                            <option value="${CurrentStudent.getGender()}" selected="selected">Female</option>
                                            <option value="0"  >Male</option>
                                        </c:if>
                                        <c:if test="${CurrentStudent.getGender()==0}">
                                            <option value="${CurrentStudent.getGender()}" selected="selected">Male</option>
                                            <option value="1" >On</option>
                                        </c:if>
                                    </c:if>

                                    <c:if test="${empty CurrentStudent.getId()}">
                                        <option value="">Select Gender</option>
                                        <option value="1">Female</option>
                                        <option value="0">Male</option>
                                    </c:if>


                                </select>

                            </div>

                        </div>




                        <div class="form-item row">
                            <div class="col-2 form-item-name">
                                <span>Status</span>

                            </div>
                            <div class="col-10 form-item-data">
                                <select name="ModelStatus">

                                    <c:if test="${not empty CurrentStudent.getStatus()}">
                                        <c:if test="${CurrentStudent.getStatus()==1}">
                                            <option value="${CurrentStudent.getStatus()}" selected="selected">On</option>
                                            <option value="0" >Off</option>
                                        </c:if>
                                        <c:if test="${CurrentStudent.getStatus()==0}">
                                            <option value="${CurrentStudent.getStatus()}" selected="selected">Off</option>
                                            <option value="1" >On</option>
                                        </c:if>
                                    </c:if>

                                    <c:if test="${empty CurrentStudent.getStatus()}">
                                        <option value="">Select Status</option>
                                        <option value="1">On</option>
                                        <option value="0">Off</option>
                                    </c:if>


                                </select>

                            </div>
                        </div>





                    </div>
                    <div class="form__button d-flex justify-content-between">
3
                        <button type="submit">Lưu</button>
                        <span class="button-back"><a href=""> <i class="fa-solid fa-arrow-left"></i> Trở lại</a></span>

                    </div>



                    <input type="hidden" value="edit" id="type" name="type"/>
                    <input type="hidden" value="${Current.geteId()}" id="id" name="ModelId"/>


                </form>



            </div>
        </div>







    </div>

</section>



<link rel="stylesheet" href=<c:url value='https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css'/>/>
<script src="<c:url value='https://code.jquery.com/jquery-3.3.1.min.js'/>"></script>
<script src="<c:url value='https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/paging/jquery.twbsPagination.js' />"></script>




<%--<script type="text/javascript">--%>
<%--    var currentPage_ = ${StudentModel.getPage()};--%>
<%--    var totalPages_ = ${StudentModel.getTotalPages()};--%>
<%--    var limit = 5;--%>

<%--    $(function(){--%>
<%--        window.pagObj = $('#pagination').twbsPagination({--%>
<%--            totalPages : totalPages_,--%>
<%--            visiblePages: 4,--%>
<%--            startPage: currentPage_,--%>
<%--            onPageClick : function(event, page) {--%>
<%--                console.info(page + ' (from options)');--%>
<%--                if (currentPage_!=page){--%>
<%--                    $('#maxItemPerPage').val(limit);--%>
<%--                    $('#page').val(page);--%>
<%--                    $('#sortName').val('StudentId');--%>
<%--                    $('#sortBy').val('asc');--%>
<%--                    $('#type').val('list');--%>
<%--                    $('#formSubmit').submit();--%>

<%--                }--%>

<%--            }--%>
<%--        }).on('page', function(event, page) {--%>
<%--            console.info(page + ' (from event listening)');--%>

<%--        });--%>
<%--    });--%>
<%--</script>--%>


</body>