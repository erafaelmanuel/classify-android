package io.ermdev.classify.data.local.teacher;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import retrofit2.http.DELETE;

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
    void add(Teacher... teachers);

    @Update
    void update(Teacher... teachers);

    @DELETE
    void delete(Teacher... teachers);
}
