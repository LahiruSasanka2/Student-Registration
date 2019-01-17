package lk.ijse.sr.dao.custom.impl;

import lk.ijse.sr.dao.CrudUtil;
import lk.ijse.sr.dao.custom.StudentDAO;
import lk.ijse.sr.entity.Student;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDAOImpl implements StudentDAO {

    public Optional<List<Student>> findAll() throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        ResultSet rst = CrudUtil.execute("SELECT * FROM student");
        while (rst.next()) {
            Student student = new Student(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            );
            students.add(student);
        }
        return Optional.ofNullable(students);
    }

    public boolean save(Student student) throws Exception {
        return CrudUtil.<Integer>execute("INSERT INTO student VALUES (?,?,?,?,?)",
                student.getSid(),
                student.getName(),
                student.getTell(),
                student.getCity(),
                student.getNic()
        ) > 0;
    }

    public boolean update(Student student) throws Exception {
        return CrudUtil.<Integer>execute(
                "UPDATE student SET name=?,tell=?,city=?,nic=? WHERE SID=?",
                student.getName(),
                student.getTell(),
                student.getCity(),
                student.getNic(),
                student.getSid()
        ) > 0;
    }

    public boolean delete(String studentID) throws Exception {
        return CrudUtil.<Integer>execute("DELETE FROM student WHERE SID=?", studentID) > 0;
    }

    @Override
    public Optional<Student> find(String studentID) throws Exception {
        ResultSet rst = CrudUtil
                .execute("SELECT * FROM student WHERE SID=?", studentID);
        Student student = null;
        if (rst.next()) {
            student = new Student(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            );
        }
        return Optional.ofNullable(student);
    }
}
