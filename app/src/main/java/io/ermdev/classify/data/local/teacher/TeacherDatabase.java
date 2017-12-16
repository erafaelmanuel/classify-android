package io.ermdev.classify.data.local.teacher;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by erafaelmanuel on 12/16/2017.
 */

@Database(entities = Teacher.class, version = 1)
public abstract class TeacherDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "classify.db";

    private static volatile TeacherDatabase instance;

    public abstract TeacherDao teacherDao();

    public static synchronized TeacherDatabase getInstance(Context context) {
        if(instance == null)
            instance = createTeacherDatabase(context);
        return instance;
    }

    private static TeacherDatabase createTeacherDatabase(Context context) {
        return Room
                .databaseBuilder(context, TeacherDatabase.class, DATABASE_NAME)
                .build();
    }
}
