/* GLOBAL*/
Create database ManagementStudents;
drop database ManagementStudents;

Use ManagementStudents;



-- THỰC THỂ ROLE 1 - ADMIN 2 - NORMAL USER
DROP TABLE RoleModel;
CREATE TABLE RoleModel(

                          RoleId 					BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                          RoleName				VARCHAR (100) NOT NULL,
                          RoleCode				VARCHAR (100) NOT NULL,

                          RoldCreatedDate			TIMESTAMP NULL,
                          RoleCreatedBy			VARCHAR (100) NULL,
                          RoleModifiedDate 		TIMESTAMP NULL,
                          RoldModifiedBy 			VARCHAR(100) NULL

);


-- THỰC THỂ USER:
CREATE TABLE UserModel(
                          UserId 					BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                          Username				VARCHAR (100) NOT NULL,
                          UserPassword			VARCHAR (100) NOT NULL,
                          UserFullName			VARCHAR (255) NOT NULL,
                          UserStatus				INT NOT NULL,
                          RoleId 					BIGINT NOT NULL,
                          UserCreatedDate			TIMESTAMP NULL,
                          UserCreatedBy			VARCHAR(100) NULL,
                          UserModifiedDate		TIMESTAMP NULL,
                          UserModifiedBy			VARCHAR(100) NULL

);

-- rằng buộc giữa thực thể User và thực thể Role
ALTER TABLE UserModel
    ADD CONSTRAINT FK_UserRole
        FOREIGN KEY UserModel(RoleId) REFERENCES RoleModel(RoleId);



-- thực thể Department (KHOA)
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

-- THỰC HIỆN THAY ĐỔI DATATYE CỦA ATTRIBUTE
ALTER TABLE Department
    MODIFY COLUMN DepartmentFoundedDate  DATE NULL;


-- THỰC THỂ MAJOR (NGÀNH)
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

-- RÀNG BUỘC GIỮA THỰC THỂ KHOA VÀ NGÀNH (MỘT KHOA CÓ THỂ CÓ NHIỀU NGÀNH)
ALTER TABLE Major
    ADD CONSTRAINT FK_MajorDepartment
        FOREIGN KEY Major(DepartmentId ) REFERENCES DepartMent(DepartmentId );



DROP TABLE Lecturer;
ALTER TABLE Lecturer

CREATE TABLE Lecturer (
                          LecturerId 					BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                          LecturerFullName			VARCHAR (100) NOT NULL,
                          LecturerStatus				INT NOT NULL,
                          LecturerDateOfBirth			DATE NULL,
                          LecturerDegree				VARCHAR(100) NOT NULL,
                          LecturerAddress				VARCHAR(200) NOT NULL,
                          LecturerGmail				VARCHAR(100) NOT NULL,
                          LecturerPhoneNumber      	VARCHAR(100) NOT NULL,
                          DepartmentId 				BIGINT NOT NULL,

                          LecturerCreatedDate			TIMESTAMP NULL,
                          LecturerCreatedBy			VARCHAR (100) NULL,
                          LecturerModifiedDate 		TIMESTAMP NULL,
                          LecturerModifiedBy 			VARCHAR(100) NULL


);

-- RÀNG BUỘC GIỮA THỰC THỂ GIẢNG VIÊN VÀ THỰC THỂ KHOA

ALTER TABLE 		Lecturer
    ADD CONSTRAINT 		FK_LecturerDepartment
        FOREIGN KEY 		Lecturer(DepartmentId) REFERENCES DepartMent(DepartmentId );






CREATE TABLE HomeroomClass(
                              HomeroomClassId 				BIGINT NOT NULL PRIMARY KEY ,
                              HomeroomClassName				VARCHAR (100) NOT NULL,
                              LecturerId 						BIGINT NOT NULL,
                              MajorId 						BIGINT NOT NULL,
                              HomeroomClassYear				YEAR NOT NULL,


                              HomeroomClassCreatedDate		TIMESTAMP NULL,
                              HomeroomClassCreatedBy			VARCHAR (100) NULL,
                              HomeroomClassModifiedDate 		TIMESTAMP NULL,
                              HomeroomClassModifiedBy 		VARCHAR(100) NULL

);

-- RÀNG BUỘC THỰC THỂ LỚP CHỦ NHIỆM VÀ KHOA | GIẢNG VIÊN
ALTER TABLE 		HomeroomClass
    ADD CONSTRAINT 		FK_HomroomClassLecturer
        FOREIGN KEY 		HomeroomClass(LecturerId) REFERENCES Lecturer(LecturerId);

ALTER TABLE 		HomeroomClass
    ADD CONSTRAINT 		FK_HomroomClassMajor
        FOREIGN KEY 		HomeroomClass(MajorId) REFERENCES Major(MajorId);




ALTER TABLE Student
    ADD SutdentGender BIT;

ALTER TABLE Lecturer
    ADD LecturerGender BIT


CREATE TABLE Student (
                         StudentId 					BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                         StudentFullName				VARCHAR (100) NOT NULL,
                         StudentStatus				INT NOT NULL,
                         StudentDateOfBirth			DATE NULL,
                         StudentAddress				VARCHAR(200) NOT NULL,
                         StudentGmail				VARCHAR(100) NOT NULL,
                         StudentPhoneNumber      	VARCHAR(100) NOT NULL,

                         MajorId						BIGINT NOT NULL,
                         HomeroomClassId				BIGINT NOT NULL,

                         StudentCreatedDate			TIMESTAMP NULL,
                         StudentCreatedBy			VARCHAR (100) NULL,
                         StudentModifiedDate 		TIMESTAMP NULL,
                         StudentModifiedBy 			VARCHAR(100) NULL


);

-- RÀNG BUỘC THỰC THỂ LỚP CHỦ NHIỆM VÀ KHOA | GIẢNG VIÊN
ALTER TABLE 		Student
    ADD CONSTRAINT 		FK_StudentHomroomClass
        FOREIGN KEY 		Student(HomeroomClassId) REFERENCES HomeroomClass(HomeroomClassId);

ALTER TABLE 		HomeroomClass
    ADD CONSTRAINT 		FK_StudentMajor
        FOREIGN KEY 		Student(MajorId) REFERENCES Major(MajorId);


DROP TABLE SubjectTerm;
CREATE TABLE Semester (
                          SemesterId 					BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                          SemesterName				VARCHAR (100) NOT NULL,

                          SemesterStartedDay			DATE NOT NULL,
                          SemesterEndedDay			DATE NOT NULL,


                          SemesterCreatedDate			TIMESTAMP NULL,
                          SemesterCreatedBy			VARCHAR (100) NULL,
                          SemesterModifiedDate 		TIMESTAMP NULL,
                          SemesterModifiedBy 			VARCHAR(100) NULL


);

CREATE TABLE SubjectTerm (
                             SubjectId 					BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                             SubjectName					VARCHAR (100) NOT NULL,
                             SubjectCode					VARCHAR (100) NOT NULL,

                             SubjectStartedDay			DATE NOT NULL,
                             SubjectEndedDay				DATE NOT NULL,

                             SemesterId					BIGINT NOT NULL,
                             MajorId 					BIGINT NOT NULL,


                             SemesterCreatedDate			TIMESTAMP NULL,
                             SemesterCreatedBy			VARCHAR (100) NULL,
                             SemesterModifiedDate 		TIMESTAMP NULL,
                             SemesterModifiedBy 			VARCHAR(100) NULL


);

-- RÀNG BUỘC THỰC THỂ LỚP CHỦ NHIỆM VÀ KHOA | GIẢNG VIÊN
ALTER TABLE 		SubjectTerm
    ADD CONSTRAINT 		FK_SubjectSemester
        FOREIGN KEY 		SubjectTerm(SemesterId) REFERENCES Semester(SemesterId);

ALTER TABLE 		SubjectTerm
    ADD CONSTRAINT 		FK_SubjectTermMajor
        FOREIGN KEY 		SubjectTerm(MajorId) REFERENCES Major(MajorId);


/*CREATE TABLE `CourseMembership` (
    `Student` INT UNSIGNED NOT NULL,
    `Course` SMALLINT UNSIGNED NOT NULL,
    PRIMARY KEY (`Student`, `Course`),
    CONSTRAINT `Constr_CourseMembership_Student_fk`
        FOREIGN KEY `Student_fk` (`Student`) REFERENCES `Student` (`StudentID`)
        ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT `Constr_CourseMembership_Course_fk`
        FOREIGN KEY `Course_fk` (`Course`) REFERENCES `Course` (`CourseID`)
        ON DELETE CASCADE ON UPDATE CASCADE
)*/

CREATE TABLE MarkSubject (

                             StudentId 					BIGINT NOT NULL,
                             SubjectId					BIGINT NOT NULL,
                             Mark						FLOAT NOT NULL,

                             PRIMARY KEY 	(StudentId, SubjectId),
                             CONSTRAINT 		FK_MarkOfSubject
                                 FOREIGN KEY 	MarkSubject (SubjectId) REFERENCES SubjectTerm(SubjectId)
                                     ON DELETE CASCADE ON UPDATE CASCADE,

                             CONSTRAINT FK_MarkOfStudent
                                 FOREIGN KEY MarkSubject (StudentId) REFERENCES Student(StudentId)
                                     ON DELETE CASCADE ON UPDATE CASCADE

);

-- RÀNG BUỘC GIỮA HỌC PHẦN VÀ GIÁO VIÊN SINH RA THỰC THỂ LỚP HỌC PHẦN
CREATE TABLE ClassCoruse (

                             LecturerId 					BIGINT NOT NULL,
                             SubjectId 					BIGINT NOT NULL,


                             PRIMARY KEY (LecturerId , SubjectId),
                             CONSTRAINT FK_CourseLecturer
                                 FOREIGN KEY ClassCoruse (LecturerId ) REFERENCES Lecturer(LecturerId )
                                     ON DELETE CASCADE ON UPDATE CASCADE,

                             CONSTRAINT FK_CourseSubject
                                 FOREIGN KEY ClassCoruse (SubjectId) REFERENCES SubjectTerm (SubjectId)
                                     ON DELETE CASCADE ON UPDATE CASCADE

);


CREATE TABLE RegisteredClass (
                                 StudentId 					BIGINT NOT NULL,

                                 LecturerId 					BIGINT NOT NULL,
                                 SubjectId 					BIGINT NOT NULL,



                                 PRIMARY KEY (LecturerId , SubjectId, StudentId ),

                                 CONSTRAINT FK_RegisteredClassStudent
                                     FOREIGN KEY RegisteredClass (StudentId ) REFERENCES Student(StudentId )
                                         ON DELETE CASCADE ON UPDATE CASCADE,

                                 CONSTRAINT FK_RegisteredClassLecturer
                                     FOREIGN KEY RegisteredClass (LecturerId ) REFERENCES Lecturer(LecturerId )
                                         ON DELETE CASCADE ON UPDATE CASCADE,

                                 CONSTRAINT FK_RegisteredClassSubject
                                     FOREIGN KEY RegisteredClass (SubjectId) REFERENCES SubjectTerm (SubjectId)
                                         ON DELETE CASCADE ON UPDATE CASCADE

);

ALTER TABLE ClassCoruse  drop column SubjectName
ALTER TABLE ClassCoruse
    ADD ClassCoruseId BIgint

ALTER TABLE MarkSubject
    add MarkSubjectId Bigint

ALTER TABLE  RegisteredClass
    ADD RegisteredClassId BIGINT
    INSERT INTO Student ()


ALTER TABLE MarkSubject
    MODIFY COLUMN MarkSubjectId BIGINT UNIQUE  AUTO_INCREMENT FIRST;

ALTER TABLE ClassCoruse
    MODIFY COLUMN ClassCoruseId BIGINT UNIQUE  AUTO_INCREMENT FIRST;

ALTER TABLE RegisteredClass
    MODIFY COLUMN RegisteredClassId BIGINT UNIQUE  AUTO_INCREMENT FIRST;

ALTER TABLE RegisteredClass
DROP COLUMN RegisteredClassId

ALTER TABLE MarkSubject
DROP COLUMN MarkSubjectId

ALTER TABLE ClassCoruse
DROP COLUMN ClassCoruseId

DROP TABLE RegisteredClass














