package io.ermdev.classify.di.module;

import android.app.Application;
import android.arch.persistence.room.Room;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.ermdev.classify.data.local.AppDatabase;
import io.ermdev.classify.data.local.student.StudentRepository;
import io.ermdev.classify.data.local.teacher.TeacherRepository;

/**
 * Created by erafaelmanuel on 12/17/2017.
 */

@Module
public class PersistenceModule {

    @Provides
    @Singleton
    public AppDatabase providesAppDatabase(Application mApplication) {
        return Room
                .databaseBuilder(mApplication, AppDatabase.class, "classify.db")
                .allowMainThreadQueries()
                .build();
    }

    @Provides
    @Singleton
    public StudentRepository providesStudentRepository(AppDatabase mAppDatabase) {
        return new StudentRepository(mAppDatabase.studentDao());
    }

    @Provides
    @Singleton
    public TeacherRepository providesTeacherRepository(AppDatabase mAppDatabase) {
        return new TeacherRepository(mAppDatabase.teacherDao());
    }
}
