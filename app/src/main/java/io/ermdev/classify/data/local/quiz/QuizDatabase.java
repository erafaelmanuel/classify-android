package io.ermdev.classify.data.local.quiz;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by erafaelmanuel on 12/1/2017.
 */

//@Database(entities = Quiz.class, version = 1)
public abstract class QuizDatabase extends RoomDatabase {

    private static volatile QuizDatabase INSTANCE;

    public abstract QuizDao quizDao();

    public static QuizDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (QuizDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            QuizDatabase.class, "")
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
