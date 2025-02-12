package app;

import app.daos.IDAO;
import app.entities.Student;
import jakarta.persistence.EntityManager;

public class Main {
    //private static final IDAO<T, I> = IDAO.getInstance();
    public static void main(String[] args) {

        Student s1 = new Student("Wow@wow", "Karl");


    }
}