package io.ermdev.classify.ui;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.ermdev.classify.di.component.AppComponent
import io.ermdev.classify.di.component.DaggerAppComponent
import io.ermdev.classify.di.component.DaggerDatabaseComponent
import io.ermdev.classify.di.component.DatabaseComponent
import io.ermdev.classify.di.module.AppModule
import io.ermdev.classify.di.module.DatabaseModule

/**
 * Created by erafaelmanuel on 11/28/2017.
 */

class BasicActivity : AppCompatActivity() {

    var appComponent:AppComponent? = null
    var databaseComponent:DatabaseComponent? = null

    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState);
        appComponent = DaggerAppComponent.builder().appModule(AppModule(getApplication())).build();
        databaseComponent = DaggerDatabaseComponent.builder().databaseModule(DatabaseModule()).build();
    }
}
