package io.ermdev.classify.di.component

import dagger.Component
import io.ermdev.classify.di.module.AppModule
import io.ermdev.classify.di.module.DatabaseModule
import io.ermdev.classify.ui.main.MainActivity
import javax.inject.Singleton

/**
 * Created by erafaelmanuel on 1/3/2018.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class, DatabaseModule::class))
interface DatabaseComponent {
    fun inject(activity: MainActivity)
}