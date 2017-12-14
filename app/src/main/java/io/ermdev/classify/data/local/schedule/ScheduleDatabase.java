package io.ermdev.classify.data.local.schedule;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by erafaelmanuel on 12/14/2017.
 */

@Database(entities = Schedule.class, version = 1)
public abstract class ScheduleDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "classify.db";

    private static volatile ScheduleDatabase INSTANCE;

    public abstract ScheduleDao scheduleDao();

    public static ScheduleDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (ScheduleDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ScheduleDatabase.class, DATABASE_NAME)
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
