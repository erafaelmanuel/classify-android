package io.ermdev.classify.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by erafaelmanuel on 1/1/2018.
 */

@Module
class AppModule(val mApplication: Application) {

    @Provides
    @Singleton
    fun providesApplication() = mApplication
}