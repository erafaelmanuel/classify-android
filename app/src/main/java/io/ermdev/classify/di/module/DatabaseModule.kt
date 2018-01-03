package io.ermdev.classify.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by erafaelmanuel on 1/3/2018.
 */
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providesString(mApplication: Application) {

    }
}