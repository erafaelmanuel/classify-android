package io.ermdev.classify.data.local.schedule;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by erafaelmanuel on 12/14/2017.
 */

@Dao
public interface ScheduleDao {

    @Query("SELECT * FROM tblschedule WHERE id=:id")
    Schedule findById(Long id);

    @Query("SELECT * FROM tblschedule")
    List<Schedule> findAll();

    @Insert
    void insert(Schedule schedule);

    @Insert
    void insertAll(Schedule... schedule);

    @Update
    void update(Schedule schedule);

    @Update
    void updateAll(Schedule... schedule);

    @Delete
    void delete(Schedule schedule);

    @Delete
    void deleteAll(Schedule... schedule);

    @Query("DELETE FROM tblschedule WHERE id=:id")
    void deleteById(Long id);
}
