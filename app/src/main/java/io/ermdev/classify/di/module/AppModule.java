package io.ermdev.classify.di.module;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import io.ermdev.mapfierj.SimpleMapper;

/**
 * Created by erafaelmanuel on 11/28/2017.
 */

@Module
public class AppModule {

    private Application mApplication;

    public AppModule(Application mApplication){
        this.mApplication = mApplication;
    }

    @Provides
    public Application providesApplication() {
        return mApplication;
    }

    @Provides
    public SimpleMapper providesSimpleMapper() {
        return new SimpleMapper();
    }
}
