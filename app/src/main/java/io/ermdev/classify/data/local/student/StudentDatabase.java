package io.ermdev.classify.data.local.student;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by erafaelmanuel on 12/16/2017.
 */

@Database(entities = Student.class,version = 1)
public abstract class StudentDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "classify.db";

    private static volatile StudentDatabase instance;

    public abstract StudentDao studentDao();

    public static synchronized StudentDatabase getInstance(Context context) {
        if(instance == null)
            instance = createStudentDatabase(context);
        return instance;
    }

    private static StudentDatabase createStudentDatabase(Context context) {
        return Room
                .databaseBuilder(context, StudentDatabase.class, DATABASE_NAME)
                .build();
    }
}
