package io.ermdev.classify.data.local.student;

import java.util.List;

/**
 * Created by erafaelmanuel on 12/17/2017.
 */

public class StudentRepository  {

    private StudentDao studentDao;

    public StudentRepository(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public List<Student> getAll() {
        return studentDao.getAll();
    }

    public void add(Student student) {
        studentDao.insert(student);
    }
}
