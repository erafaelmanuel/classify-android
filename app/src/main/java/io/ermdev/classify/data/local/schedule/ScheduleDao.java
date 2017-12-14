package io.ermdev.classify.data.local.schedule;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

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

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void save(Schedule schedule);

    @Query("DELETE FROM tblschedule WHERE id=:id")
    void deleteById(Long id);
}
