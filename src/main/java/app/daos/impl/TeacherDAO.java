package app.daos.impl;

import app.daos.IDAO;
import app.entities.Teacher;

import java.util.List;

public class TeacherDAO implements IDAO<Teacher, Integer> {
    @Override
    public Teacher create(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher read(Integer integer) {
        return null;
    }

    @Override
    public List<Teacher> readAll() {
        return List.of();
    }

    @Override
    public Teacher update(Teacher teacher) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}
