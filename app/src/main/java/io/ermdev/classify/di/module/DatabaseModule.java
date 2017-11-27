package io.ermdev.classify.di.module;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import io.ermdev.classify.data.repository.QuizRepository;

/**
 * Created by Remsama on 11/28/2017.
 */

@Module
public class DatabaseModule {

    private Application mApplication;

    public DatabaseModule(Application app) {
        this.mApplication = app;
    }

    @Provides
    public QuizRepository providesQuizRepository() {
        return null;
    }
}
