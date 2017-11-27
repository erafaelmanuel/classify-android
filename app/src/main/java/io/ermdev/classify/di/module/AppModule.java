package io.ermdev.classify.di.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by erafaelmanuel on 11/28/2017.
 */

@Module
public class AppModule {

    private final Application mApplication;

    public AppModule(Application app) {
        this.mApplication = app;
    }

    @Provides
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    String provideDatabaseName() {
        return "classify.db";
    }

    @Provides
    Integer provideDatabaseVersion() {
        return 1;
    }

}
