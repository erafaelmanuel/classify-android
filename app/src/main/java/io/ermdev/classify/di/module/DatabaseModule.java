package io.ermdev.classify.di.module;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import io.ermdev.classify.data.local.schedule.ScheduleDao;
import io.ermdev.classify.data.local.schedule.ScheduleDatabase;

/**
 * Created by erafaelmanuel on 11/28/2017.
 */

@Module
public class DatabaseModule {

    @Provides
    public ScheduleDatabase providesScheduleDatabase(Application mApplication) {
        return ScheduleDatabase.getInstance(mApplication);
    }

    @Provides
    public ScheduleDao providesScheduleDao(ScheduleDatabase mScheduleDatabase) {
        return mScheduleDatabase.scheduleDao();
    }
}
