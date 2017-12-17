package io.ermdev.classify.data.local._class;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import io.ermdev.classify.data.local.student.Student;

/**
 * Created by erafaelmanuel on 12/16/2017.
 */

@Dao
public interface ClassDao {

    @Query("SELECT * FROM tblclass WHERE id=:classId")
    Class getById(long classId);

    @Query("SELECT * FROM tblclass")
    List<Class> getAll();

    @Query("SELECT * FROM tblstudent AS S JOIN tblclass AS C ON S.id=C.studentId WHERE C.id=:classId LIMIT 1")
    Student getStudent(long classId);

    @Insert
    void add(Class... classes);

    @Update
    void update(Class... classes);

    @Delete
    void delete(Class... classes);
}
