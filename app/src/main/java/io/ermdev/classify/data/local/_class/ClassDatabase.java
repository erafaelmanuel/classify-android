package io.ermdev.classify.data.local._class;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by erafaelmanuel on 12/16/2017.
 */

@Database(entities = Class.class, version = 1)
public abstract class ClassDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "classify.db";

    private static volatile ClassDatabase instance;

    public abstract ClassDao classDao();

    public static synchronized ClassDatabase getInstance(Context context) {
        if(instance == null)
            instance = createClassDatabase(context);
        return instance;
    }

    private static ClassDatabase createClassDatabase(Context context) {
        return Room
                .databaseBuilder(context, ClassDatabase.class, DATABASE_NAME)
                .build();
    }
}
