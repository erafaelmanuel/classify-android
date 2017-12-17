package io.ermdev.classify.data.local.classz;

import io.ermdev.classify.data.local.student.Student;
import io.ermdev.classify.data.local.teacher.Teacher;
import io.ermdev.mapfierj.Excluded;

/**
 * Created by erafaelmanuel on 12/16/2017.
 */

public class ClassDto {

    private long id;

    @Excluded
    private Student student;

    @Excluded
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

    @Override
    public String toString() {
        return "ClassDto{" +
                "id=" + id +
                ", student=" + student +
                ", teacher=" + teacher +
                '}';
    }
}
