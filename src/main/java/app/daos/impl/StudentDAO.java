package app.daos.impl;

import app.daos.IDAO;
import app.entities.Student;

import java.util.List;

public class StudentDAO implements IDAO<Student, Integer> {
    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student read(Integer integer) {
        return null;
    }

    @Override
    public List<Student> readAll() {
        return List.of();
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}
