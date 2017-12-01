package io.ermdev.classify.data.quiz;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by erafaelmanuel on 11/28/2017.
 */

@Dao
public interface QuizDao {

    @Query("SELECT * FROM tblquiz WHERE id=:id")
    Quiz findById(Long id);

    @Query("SELECT * FROM tblquiz")
    List<Quiz> findAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void save(Quiz quiz);
}
