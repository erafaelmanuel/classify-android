package io.ermdev.classify.data.local.student;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by erafaelmanuel on 12/16/2017.
 */

@Dao
public interface StudentDao {

    @Query("SELECT * FROM tblstudent WHERE id=:studentId")
    Student getById(long studentId);

    @Query("SELECT * FROM tblstudent")
    List<Student> getAll();

    @Insert
    void insert(Student student);

    @Insert
    void insertAll(Student... students);

    @Update
    void update(Student... students);

    @Delete
    void delete(Student... students);
}
