CREATE TABLE Department (
                            DepartmentId 				BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                            DepartmentName				VARCHAR (100) NOT NULL,
                            DepartmentCode				VARCHAR (100) NOT NULL,
                            DepartmentFoundedDate		DATE NULL,


                            DepartmentCreatedDate		TIMESTAMP NULL,
                            DepartmentCreatedBy			VARCHAR (100) NULL,
                            DepartmentModifiedDate 		TIMESTAMP NULL,
                            DepartmentModifiedBy 		VARCHAR(100) NULL


);

select * from Department

    insert into Department(DepartmentName, DepartmentCode, DepartmentFoundedDate )
values ('Công Nghệ Thông Tin', 'cong-nghe-thong-tin', '2001-12-21');

insert into Department(DepartmentName, DepartmentCode, DepartmentFoundedDate )
values ('Cơ khí', 'co-khi', '2001-12-21');

insert into Department(DepartmentName, DepartmentCode, DepartmentFoundedDate )
values ('Du lịch', 'du-lich', '2001-12-21');

insert into Department(DepartmentName, DepartmentCode, DepartmentFoundedDate )
values ('Ngôn ngữ', 'ngon-ngu', '2001-12-21');

insert into Department(DepartmentName, DepartmentCode, DepartmentFoundedDate )
values ('Điện tử', 'dien-tu', '2001-12-21');


update Department
set DepartmentName = 'ĐIỆN TỬ'
where DepartmentId = 5

select * from Department



CREATE TABLE Major (
                       MajorId 				BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                       MajorName				VARCHAR (100) NOT NULL,
                       MajorCode				VARCHAR (100) NOT NULL,
                       MajorFoundedDate		DATE NULL,

                       DepartmentId 			BIGINT NOT NULL,
                       MajorCreatedDate		TIMESTAMP NULL,
                       MajorCreatedBy			VARCHAR (100) NULL,
                       MajorModifiedDate 		TIMESTAMP NULL,
                       MajorModifiedBy 		VARCHAR(100) NULL


);

INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Hệ Thống Thông Tin', 'HTTT', '2001-12-21', 1);
INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Khoa Học Máy Tính', 'KHMT', '2001-12-21', 1);
INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Kĩ Thuật Phần Mềm', 'KTPM', '2001-12-21', 1);
INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Công Nghệ Thông Tin', 'CNTT', '2001-12-21', 1);


INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Công Nghệ Kĩ Thuật Cơ Khí', 'KTCK', '2001-12-21', 2);
INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Công Nghệ Kĩ Thuật Khuôn Mẫu', 'KTKM', '2001-12-21', 2);

INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Du Lịch', 'DL', '2001-12-21', 3);
INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Quản Trị Khách Sạn', 'QTKS', '2001-12-21', 3);
INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Quản Trị Dịch Vụ Du Lịch & Lữ Hành', 'QTDV', '2001-12-21', 3);



INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Ngôn Ngữ Anh', 'NNA', '2001-12-21', 4);
INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Ngôn Ngữ Nhật', 'NNN', '2001-12-21', 4);
INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Ngôn Ngữ Trung', 'NNT', '2001-12-21', 4);


INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Công Nghệ Kĩ Thuật Điện Tử - Viễn Thông', 'DTVT', '2001-12-21', 5);
INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Công Nghệ Kĩ Thuật Máy Tính', 'KTMT', '2001-12-21', 5);
INSERT INTO Major(MajorName, MajorCode, MajorFoundedDate, DepartmentId )
values('Công Nghệ Kĩ Thuật Kĩ Thuật Nhiệt', 'KTN', '2001-12-21', 5);


select * from major

select * from Lecturer

select count(*) from Lecturer

select * from HomeroomClass


ALTER TABLE SubjectTerm AUTO_INCREMENT = 1



select * from Student


select * from ClassCoruse


delete  from MarkSubject where StudentId <20000

delete  from RegisteredClass where LecturerId <20000

delete  from ClassCoruse where LecturerId <20000





