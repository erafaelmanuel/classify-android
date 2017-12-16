package io.ermdev.classify.data.local._class;

import io.ermdev.classify.data.local.student.Student;
import io.ermdev.classify.data.local.teacher.Teacher;

/**
 * Created by erafaelmanuel on 12/16/2017.
 */

public class ClassDto {

    private long id;
    private Student student;
    private Teacher teacher;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
