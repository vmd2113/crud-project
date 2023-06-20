<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Duong
  Date: 6/10/2023
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang chủ</title>
</head>
<body>
<section>
    <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src=<c:url value='/template/web-homepage/img/carousel/haui_1.jpg'/>  class=" d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src=<c:url value='/template/web-homepage/img/carousel/haui_2.jpg'/> class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src=<c:url value='/template/web-homepage/img/carousel/haui_3.jpg'/> class="d-block w-100" alt="...">
            </div>

            <div class="carousel-item">
                <img src=<c:url value='/template/web-homepage/img/carousel/haui_3.jpg'/> class="d-block w-100" alt="...">
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>


</section>

<section class="event text-center container">

    <div class="event__content container justify-content-sm-center">

        <h1 class=" font-decorator event__text text-center line">SỰ KIỆN</h1>

        <div class="row">
                <span class="p-2 text-uppercase"><b>Đại học Công nghiệp Hà Nội hợp tác, phát triển khoa học công nghệ
                        trên địa bản Thủ đô Hà Nội</b>
                </span>


            <p class=""><i> Ngày 09/6, Đại học Công nghiệp Hà Nội đã có buổi làm việc với ban chủ nhiệm CT-03 và
                Lãnh đạo Sở Khoa học và Công nghệ Hà Nội về việc đầu tư cho nghiên cứu khoa học liên ngành, ứng
                dụng vào thực tiễn góp phần thúc đẩy phát triển kinh
                tế - xã hội của Thủ đô Hà Nội.</i>
            </p>

            <p>
                Phát biểu tại buổi làm việc, TS.Nguyễn Quốc Hà, Phó Giám đốc Sở khoa học và Công nghệ Hà Nội đánh giá cao những kết quả đạt được của ban chủ nhiệm chương trình CT-03 trong thời gian vừa qua. Để các đề tài nghiên cứu khoa học ứng dụng vào thực tiễn, TS.Nguyễn
                Quốc Hà nhấn mạnh 03 tiêu chí quan trọng đối với các nghiên cứu khoa học: Các đề tài nghiên cứu khoa học phải có tính mới, quy mô đề tài phải nằm trong quy mô, yêu cầu cấp Thành phố, địa chỉ ứng dụng rõ ràng và thuộc phạm vi ứng dụng
                cho người dân, các cơ quan, sở ngành, bệnh viện, doanh nghiệp,… trên địa bàn Thành phố Hà Nội. Bên cạnh đó, hoạt động nghiên cứu khoa học cần tăng cường kết nối quan hệ hợp tác giữa ba "nhà": nhà khoa học, nhà quản lý và doanh nghiệp
                theo hướng lấy doanh nghiệp làm trung tâm, nhà trường làm chủ thể. Phó Giám đốc Sở khoa học và Công nghệ Hà Nội bày tỏ mong muốn các viện, các trường, đặc biệt là Trường Đại học Công nghiệp Hà Nột phát huy các tiềm năng về khoa học
                công nghệ, cơ sở vật chất để thúc đẩy nghiên cứu, ứng dụng, chuyển giao công nghệ trên địa bàn Thủ đô. Đồng thời, các nhà khoa học, các nhà nghiên cứu, ban chủ nhiệm chương trình 03 tiếp tục đóng góp cho thành phố trong công tác tham
                mưu các đề tài nghiên cứu khoa học, và triển khai các nhiệm vụ phát triển khoa học, công nghệ, đổi mới sáng tạo trong giai đoạn tới.
            </p>

            <p>------❖❖❖------</p>
        </div>

        <div class="row">
                <span class="p-2 text-uppercase"><b>VNPT đồng hành cùng tuổi trẻ Đại học Công nghiệp Hà Nội trong các
                        hoạt động chuyển đổi số</b>
                </span>


            <p class=""><i> Sáng ngày 7/6, PGS.TS.Phạm Văn Đông - Phó Hiệu trưởng trường Đại học Công nghiệp Hà Nội
                đã có buổi tiếp và làm việc với đại diện VNPT Hà Nội trong chương trình Hỗ trợ các hoạt động
                chuyển đổi số.</i>
            </p>

            <p>
                Theo đó, VNPT Hà Nội sẽ triển khai các sản phẩm, dịch vụ công nghệ số, truyền thông nhằm nâng cao ứng dụng công nghệ thông tin, truyền thông trong hoạt động Đoàn của Trường Đại học Công nghiệp Hà Nội. Chương trình hỗ trợ các hoạt động chuyển đổi số của
                VNPT Hà Nội đã góp phần vào sự nghiệp bồi dưỡng, giáo dục thế hệ trẻ Việt Nam chủ động, tích cực tiếp thu, ứng dụng khoa học công nghệ; Khích lệ tinh thần khởi nghiệp, sáng tạo; Nâng cao năng lực nắm bắt, góp phần hiệu quả vào công
                cuộc chuyển đổi số Quốc gia và thích ứng với Cách mạng công nghiệp lần thứ tư. Là đơn vị đồng hành và hỗ trợ các hoạt động của tuổi trẻ Đại học Công nghiệp Hà Nội, cuối tháng 12/2022 Đoàn Thanh niên Trường Đại học Công nghiệp Hà Nội
                và VNPT Hà Nội đã ký kết Biên bản ghi nhớ hợp tác về chuyển đổi số trong tổ chức các hoạt động hỗ trợ sinh viên giai đoạn 2023 - 2025. Theo Biên bản ghi nhớ, trong lĩnh vực chuyển đổi số, hai bên sẽ phối hợp tổ chức các chương trình
                tập huấn các kỹ năng về chuyển đổi số, đào tạo về đảm bảo an ninh mạng cho Đoàn viên thanh niên; tham quan, thực tập tại công ty; tài trợ học bổng cho sinh viên có hoàn cảnh khó khăn;….
            </p>

            <p>------❖❖❖------</p>


        </div>

        <div class="row">
                <span class="p-2 text-uppercase"><b>Hội thảo Khoa học ứng dụng Công nghệ Internet vạn vật IoT</b>
                </span>


            <p class=""><i> Chiều ngày 09/05, Đoàn Thanh niên - Hội sinh viên trường Đại học Công nghiệp Hà Nội đăng
                cai tổ chức Hội thảo Khoa học ứng dụng Công nghệ Internet vạn vật IoT. Hội thảo quy tụ nhiều
                chuyên gia trong lĩnh vực IoT đến từ các trường đại học trong cả nước, với nhiều tham luận, báo
                cáo có tính chuyên sâu về chuyển đổi số và IoT.</i>
            </p>

            <p>
                Tham dự Hội thảo, có đồng chí Nguyễn Thiên Tú – Giám đốc Trung tâm phát triển Khoa học công nghệ và Tài năng trẻ Trung ương Đoàn; đồng chí Hoàng Thanh Tâm - Uỷ viên Ban Thường vụ, Trưởng ban Thanh niên trường học Thành đoàn, Phó Chủ tịch Thường trực Hội
                Sinh viên Việt Nam thành phố Hà Nội;đồng chí Vũ Minh Hằng - UV BCH, Phó Trưởng ban Thanh niên trường học Thành đoàn. Cùng các đồng chí Bí thư các trường Đại học Điện lực, Mỏ địa chất, Bách khoa Hà Nội; Kinh tế quốc dân, Học viện Tài
                chính, Đại học Mở…;các cơ quan thông tấn báo chí, truyền hình Hà Nội, Báo Thanh niên, Sinh viên Việt nam,Tuổi trẻ Thủ đô, Cổng thông tin thành phố. Về phía Đại học Công nghiệp Hà Nội, có: TS.Nguyễn Văn Thiện,Thường vụ Đảng uỷ, Phó
                Hiệu trưởng nhà trường; đồng chí Đỗ Minh Hiền, UV BCH Thành đoàn, Bí thư Đoàn trường; đại diện các khoa, trung tâm; BCH Đoàn trường, Hội sinh viên Nhà trường. Phát biểu tại Hội thảo, TS.Nguyễn Văn Thiện - Phó Hiệu trưởng Trường Đại
                học Công nghiệp Hà Nội cho biết: Ứng dụng IoT và chuyển đổi số sẽ làm thay đổi diện mạo của đất nước, của mọi lĩnh vực trong xã hội từ kinh tế, văn hóa, giáo dục, giải trí...Sứ mạng ấy, được trao cho những người làm và quan tâm đến
                Công nghệ thông tin, đặc biệt là đội ngũ đoàn viên – thanh niên… Hội thảo sẽ là diễn đàn để những người quan tâm đến Công nghệ thông tin có cơ hội giao lưu, chia sẻ những kiến thức mới, cách làm mới để công cuộc chuyển đổi số, mục
                tiêu đổi mới sáng tạo của đoàn viên thanh niên đạt nhiều kết quả. Về công tác nghiên cứu khoa học, TS.Kiều Xuân Thực, Hiệu trưởng Trường Đại học Công nghiệp Hà Nội cho biết: Đại học Công nghiệp Hà Nội là trung tâm nghiên cứu khoa học,
                ứng dụng đa ngành, đa lĩnh vực, kết hợp giữa nghiên cứu khoa học với chuyển giao công nghệ và nâng cao chất lượng đào tạo. Hiện nay, nhà trường có tiềm lực nghiên cứu khoa học liên ngành rất lớn, trong đó, có trên 300 cán bộ, giảng
                viên có trình độ Giáo sư, Phó Giáo sư, Tiến sĩ và hơn 200 xưởng thực hành, phòng thí nghiệm được đầu tư hiện đại đồng bộ đảm bảo chất lượng đào tạo và thực hành. Nhà trường đã xây dựng chính sách đầu tư cho nghiên cứu khoa học, tạo
                ra nhiều sản phẩm phục vụ như cầu của thực tiễn đời sống. Trong thời gian tiếp theo, Đại học Công nghệ Hà Nội sẽ phối hợp chặt chẽ với ban chủ nhiệm chương trình CT-03, cùng với sở, ban,ngành có liên quan nhằm phát triển các đề tài
                nghiên cứu khoa học ứng dụng vào thực tiễn, góp phần thúc đẩy phát triển kinh tế - xã hội của Thủ đô Hà Nội.
            </p>

            <p>------❖❖❖------</p>


        </div>
    </div>

</section>



<section class="science-technology m-2">

    <div class="science-technology__content container text-center">

        <h1 class="font-decorator line">KHOA HỌC CÔNG NGHỆ</h1>
        <div class="row gx-5">
            <div class="col p-3 m-2">
                <span class="d-inline">  TOP <span class="count d-inline">25</span></span>

                <p>
                    ĐẠI HỌC DẪN ĐẦU VỀ NGHIÊN CỨU TẠI VIỆT NAM

                </p>

            </div>
            <div class="col p-3 m-2">
                <span class="count">1500</span>
                <p>
                    CÔNG BỐ QUỐC TẾ

                </p>
            </div>

            <div class="col p-3 m-2">
                <span class="count">550</span>
                <p>
                    ĐỀ TÀI/ĐỀ ÁN KHOA HỌC CÔNG NGHỆ
                </p>
            </div>
        </div>
    </div>

</section>
</body>
</html>
