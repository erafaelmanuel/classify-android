package io.ermdev.classify.data.local.teacher;

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
public interface TeacherDao {

    @Query("SELECT * FROM tblteacher WHERE id=:teacherId")
    Teacher getById(long teacherId);

    @Query("SELECT * FROM tblteacher")
    List<Teacher> getAll();

    @Insert
    void insert(Teacher teacher);

    @Insert
    void insertAll(Teacher... teachers);

    @Update
    void update(Teacher teachers);

    @Update
    void updateAll(Teacher... teachers);

    @Delete
    void delete(Teacher teacher);

    @Delete
    void deleteAll(Teacher... teachers);
}
