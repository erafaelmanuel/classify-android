package io.ermdev.classify.di.component

import dagger.Component
import io.ermdev.classify.di.module.AppModule
import io.ermdev.classify.ui.main.MainActivity
import javax.inject.Singleton

/**
 * Created by erafaelmanuel on 1/1/2018.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(activity: MainActivity)
}