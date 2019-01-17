package lk.ijse.sr.dao.custom.impl;

import lk.ijse.sr.dao.CrudUtil;
import lk.ijse.sr.dao.custom.CourseDAO;
import lk.ijse.sr.entity.Course;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseDAOImpl implements CourseDAO {

    @Override
    public Optional<Course> find(String name) throws Exception {
        ResultSet rst = CrudUtil.execute("SELECT * FROM course WHERE name=?", name);
        Course c = null;
        if (rst.next()) {
            c = new Course(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getString(5),
                    rst.getString(6)
            );
        }
        return Optional.ofNullable(c);
    }

    public Optional<List<Course>> findAll() throws Exception {
        ArrayList<Course> courses = new ArrayList<>();
        ResultSet rst = CrudUtil.<ResultSet>execute("SELECT * FROM course");
        while (rst.next()) {
            Course course = new Course(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getString(5),
                    rst.getString(6)
            );
            courses.add(course);
        }
        return Optional.ofNullable(courses);
    }

    public boolean save(Course course) throws Exception {
        return CrudUtil.<Integer>execute("INSERT INTO course VALUES (?,?,?,?,?,?)",
                course.getCid(),
                course.getName(),
                course.getDuration(),
                course.getPrice(),
                course.getDiscountAmount(),
                course.getSubject()
        ) > 0;
    }

    public boolean update(Course course) throws Exception {
        return CrudUtil.<Integer>execute(
                "UPDATE course SET name=?,duration=?,price=?,discountAmount=?,subject=? WHERE cid=?",
                course.getName(),
                course.getDuration(),
                course.getPrice(),
                course.getDiscountAmount(),
                course.getSubject(),
                course.getCid()
        ) > 0;
    }

    public boolean delete(String courseID) throws Exception {
        return CrudUtil.<Integer>execute("DELETE FROM course WHERE cid=?", courseID) > 0;
    }

}
