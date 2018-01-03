package io.ermdev.classify.di.module

import android.app.Application
import android.arch.persistence.room.Room
import dagger.Module
import dagger.Provides
import io.ermdev.classify.data.local.AppDatabase
import javax.inject.Singleton

/**
 * Created by erafaelmanuel on 1/3/2018.
 */
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providesAppDatabase(mApplication: Application): AppDatabase {
        return Room.databaseBuilder(mApplication, AppDatabase::class.java, "classidy.db")
                .allowMainThreadQueries()
                .build()
    }
}