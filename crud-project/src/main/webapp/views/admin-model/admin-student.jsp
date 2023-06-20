<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="/common/taglib.jsp" %>

<body>
<section class="container">
    <div class=" row admin-content">

        <%@ include file="/common/admin/menu.jsp" %>
        <div class="admin-information col-9">

            <div class="container">
                <div class="row">
                    <div class="row ">

                        <div class="col-12 d-flex">

                            <div class="admin-information__tool-search">

                                <form action="" class="d-flex flex-row form-search">
                                    <input class="input-search" placeholder="Tìm kiếm">
                                    <button type="button">Tìm kiếm</button>

                                </form>

                            </div>

                            <div class="admin-information__tool-edit ">


                                <c:url var="addURL" value="/admin-student">
                                    <c:param name="type" value="edit"/>
                                    <c:param name="ModelId" value="${item.getId()}"/>
                                </c:url><a href="${addURL}"><i class="fa-solid fa-circle-plus" style="color: #ff725e;"></i></a>

                            </div>
                            <div class="row d-flex justify-content-center"><ul class="pagination" id="pagination"></ul></div>



                        </div>

                    </div>
                </div>
            </div>
            <form id="formSubmit" class="" action="<c:url value='/admin-student'/>" method="GET">
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
                                <th scope="col">Major ID</th>
                                <th scope="col">Home Class ID</th>


                                <th scope="col">Edit</th>
                                <th scope="col">Delete</th>
                            </tr>
                            </thead>

                            <tbody>
                            <c:forEach var="item" items="${StudentModel.getStudentModelList()}">

                                <tr>
                                    <td>${item.getId()}</td>
                                    <td>${item.getFullName()}</td>
                                    <td>${item.getDateOfBirth()}</td>
                                    <td>${item.getAddress()}</td>
                                    <td>${item.getGmail()}</td>
                                    <td>${item.getPhoneNumber()}</td>
                                    <td>${item.getStatus()}</td>
                                    <td>${item.getGender()}</td>
                                    <td>${item.majorId}</td>
                                    <td>${item.homeroomClassId}</td>

                                    <td>
                                        <c:url var="editURL" value="/admin-student">
                                            <c:param name="type" value="edit"/>
                                            <c:param name="ModelId" value="${item.getId()}"/>
                                        </c:url><a href="${editURL}"><i class="fa-solid fa-pen-to-square"
                                                       style="color: #ff725e;"></i>
                                    </a></td>
                                    <td>
                                        <c:url var="deleteURL" value="/admin-student">
                                            <c:param name="type" value="delete"/>
                                            <c:param name="ModelId" value="${item.getId()}"/>
                                        </c:url>
                                        <a href='${deleteURL}'><i class="fa-solid fa-trash-can" style="color: #ff725e;"></i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>

                        </table>


                        <input type="hidden" id ="page" value="" name="page"/>
                        <input type="hidden" id ="maxItemPerPage" value="" name="maxItemPerPage"/>
                        <input type="hidden" value="" id="sortName" name="sortName"/>
                        <input type="hidden" value="" id="sortBy" name="sortBy"/>
                        <input type="hidden" value="" id="type" name="type"/>
                    </div>


                </div>
            </form>
        </div>





    </div>

</section>



<link rel="stylesheet" href=<c:url value='https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css'/>/>
<script src="<c:url value='https://code.jquery.com/jquery-3.3.1.min.js'/>"></script>
<script src="<c:url value='https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/paging/jquery.twbsPagination.js' />"></script>




<script type="text/javascript">
    var currentPage_ = ${StudentModel.getPage()};
    var totalPages_ = ${StudentModel.getTotalPages()};
    var limit = 5;

    $(function(){
        window.pagObj = $('#pagination').twbsPagination({
            totalPages : totalPages_,
            visiblePages: 4,
            startPage: currentPage_,
            onPageClick : function(event, page) {
                console.info(page + ' (from options)');
                if (currentPage_!=page){
                    $('#maxItemPerPage').val(limit);
                    $('#page').val(page);
                    $('#sortName').val('StudentId');
                    $('#sortBy').val('asc');
                    $('#type').val('list');
                    $('#formSubmit').submit();

                }

            }
        }).on('page', function(event, page) {
            console.info(page + ' (from event listening)');

        });
    });
</script>


</body>