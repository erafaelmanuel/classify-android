package io.ermdev.classify.di.module;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import io.ermdev.classify.data.local.schedule.ScheduleDao;
import io.ermdev.classify.data.local.schedule.ScheduleDatabase;

/**
 * Created by Remsama on 11/28/2017.
 */

@Module
public class DatabaseModule {

    private Application mApplication;

    public DatabaseModule(Application mApplication){
        this.mApplication = mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    public ScheduleDatabase providesScheduleDatabase(Application mApplication) {
        return ScheduleDatabase.getInstance(mApplication);
    }

    @Provides
    public ScheduleDao providesScheduleDao(ScheduleDatabase mScheduleDatabase) {
        return mScheduleDatabase.scheduleDao();
    }

}
