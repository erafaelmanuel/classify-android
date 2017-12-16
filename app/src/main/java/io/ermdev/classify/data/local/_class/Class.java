package io.ermdev.classify.data.local._class;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import io.ermdev.classify.data.local.student.Student;
import io.ermdev.classify.data.local.teacher.Teacher;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by erafaelmanuel on 12/1/2017.
 */

@Entity(tableName = "tblclass", foreignKeys = {
        @ForeignKey(entity = Student.class, parentColumns = "id", childColumns = "studentId",
                onDelete = CASCADE, onUpdate = CASCADE),
        @ForeignKey(entity = Teacher.class, parentColumns = "id", childColumns = "teacherId",
                onDelete = CASCADE, onUpdate = CASCADE)
})
public class Class {

    @PrimaryKey
    private Long id;
    private Student studentId;
    private Teacher teacherId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    public Teacher getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Teacher teacherId) {
        this.teacherId = teacherId;
    }
}
