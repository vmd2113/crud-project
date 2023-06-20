package com.manageschool.crudproject.dao.implement;

import com.manageschool.crudproject.dao.IStudentDAO;
import com.manageschool.crudproject.mapper.model.DepartmentMapper;
import com.manageschool.crudproject.mapper.model.StudentMapper;
import com.manageschool.crudproject.model.DepartmentModel;
import com.manageschool.crudproject.model.StudentModel;
import com.manageschool.crudproject.paging.IPageable;
import org.apache.commons.lang.StringUtils;

import java.util.List;

public class StudentDAO extends AbstractDAO<StudentModel> implements IStudentDAO {
    @Override
    public List<StudentModel> findAllStudent() {
        String sql = "SELECT * FROM Student";
        return query(sql, new StudentMapper());
    }

    @Override
    public StudentModel findOneStudentById(long id) {
        String sql = "SELECT * FROM Student WHERE StudentId = ?";
        List<StudentModel> studentModels = query(sql, new StudentMapper(), id);
        return studentModels.isEmpty() ? null : studentModels.get(0);
    }

    @Override
    public Long insert(StudentModel studentModel) {
        String sql = "INSERT INTO Student (StudentFullName, StudentStatus, StudentDateOfBirth," +
                "StudentGender, "+
                "StudentAddress, "+
                "StudentGmail, "+
                "StudentPhoneNumber, "+
                "MajorId, "+
                "HomeroomClassId) VALUES (?, ?, ?,?, ?, ?,?, ?, ?)";

        return insert(sql,
                studentModel.getFullName(),
                studentModel.getStatus(),
                studentModel.getDateOfBirth(),
                studentModel.getGender(),

                studentModel.getAddress(),
                studentModel.getGmail(),
                studentModel.getPhoneNumber(),
                studentModel.getMajorId(),
                studentModel.getHomeroomClassId());
    }

    @Override
    public void update(StudentModel studentModel) {
        StringBuilder sql = new StringBuilder("UPDATE Student SET " +
                "StudentFullName = ? ," +
                "StudentStatus = ? ," +
                "StudentDateOfBirth = ? ,"+
                "StudentGender = ? ,"+
                "StudentAddress =? ,"+
                "StudentGmail= ? ,"+
                "StudentPhoneNumber= ? ,"+
                "MajorId= ? ,"+
                "HomeroomClassId=? ,"
        );

        sql.append("StudentCreatedDate = ?, "
                + "StudentCreatedBy = ?, "
                + "StudentModifiedDate = ?, "
                + "StudentModifiedBy = ? "
                + " WHERE StudentId = ?");
        update(sql.toString(),
                studentModel.getFullName(),
                studentModel.getStatus(),
                studentModel.getDateOfBirth(),
                studentModel.getGender(),

                studentModel.getAddress(),
                studentModel.getGmail(),
                studentModel.getPhoneNumber(),
                studentModel.getMajorId(),
                studentModel.getHomeroomClassId(),

                studentModel.getCreatedDate(),
                studentModel.getModifiedDate(),
                studentModel.getCreatedBy(),
                studentModel.getModifiedBy(),
                studentModel.getId());

    }

    @Override
    public void delete(long id) {
        String sql = "delete from Student where StudentId = ?";
        StudentModel studentModel = findOneStudentById(id);

        delete_(sql, studentModel.getId());


    }

    @Override
    public List<StudentModel> findAllStudent(IPageable pageble) {
        StringBuilder sql = new StringBuilder("SELECT * FROM Student");
        if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName()) && StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
            sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
        }
        if (pageble.getOffset() != null && pageble.getLimit() != null) {
            sql.append(" LIMIT "+pageble.getOffset()+", "+pageble.getLimit()+"");
        }
        return query(sql.toString(), new StudentMapper());
    }

    @Override
    public List<StudentModel> findAllStudentInMajor(IPageable pageble) {
        return null;
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT count(*) FROM  Student";
        return count(sql);
    }
}
