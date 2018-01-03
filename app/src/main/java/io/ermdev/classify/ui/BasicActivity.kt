package io.ermdev.classify.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.ermdev.classify.di.component.DaggerDatabaseComponent
import io.ermdev.classify.di.component.DatabaseComponent
import io.ermdev.classify.di.module.AppModule
import io.ermdev.classify.di.module.DatabaseModule

/**
 * Created by erafaelmanuel on 1/1/2018.
 */
open class BasicActivity: AppCompatActivity() {

    lateinit var databaseComponent: DatabaseComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databaseComponent = DaggerDatabaseComponent
                .builder()
                .appModule(AppModule(application))
                .databaseModule(DatabaseModule())
                .build()
    }
}