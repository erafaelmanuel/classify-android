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

    private final Application application;

    public AppModule(Application app) {
        this.application = app;
    }

    @Provides
    Context provideContext() {
        return application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }
}
