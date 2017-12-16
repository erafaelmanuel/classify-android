package io.ermdev.classify.data.local._class;

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
public interface ClassDao {

    @Query("SELECT * FROM tblclass WHERE id=:classId")
    Class getById(long classId);

    @Query("SELECT * FROM tblclass")
    List<Class> getAll();

    @Insert
    void add(Class... _class);

    @Update
    void update(Class... _class);

    @DELETE
    void delete(Class... _class);
}
