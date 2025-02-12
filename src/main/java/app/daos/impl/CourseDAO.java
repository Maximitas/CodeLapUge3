package app.daos.impl;

import app.daos.IDAO;
import app.entities.Course;

import java.util.List;

public class CourseDAO implements IDAO<Course, Integer> {

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public Course read(Integer integer) {
        return null;
    }

    @Override
    public List<Course> readAll() {
        return List.of();
    }

    @Override
    public Course update(Course course) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}
