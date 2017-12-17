package io.ermdev.classify.data.local.classz;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import io.ermdev.classify.data.local.student.Student;
import io.ermdev.classify.data.local.teacher.Teacher;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by erafaelmanuel on 12/1/2017.
 */

@Entity(tableName = "tblclass",
        indices = {@Index("studentId"), @Index("teacherId")},
        foreignKeys = {
        @ForeignKey(entity = Student.class, parentColumns = "id", childColumns = "studentId",
                onDelete = CASCADE, onUpdate = CASCADE),
        @ForeignKey(entity = Teacher.class, parentColumns = "id", childColumns = "teacherId",
                onDelete = CASCADE, onUpdate = CASCADE)
})
public class Class {

    @PrimaryKey
    private long id;
    private long studentId;
    private long teacherId;

    @Ignore
    public Class(){}

    public Class(long id, long studentId, long teacherId) {
        this.id = id;
        this.studentId = studentId;
        this.teacherId = teacherId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                '}';
    }
}
