package io.ermdev.classify.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.ermdev.classify.di.component.AppComponent;
import io.ermdev.classify.di.component.DaggerAppComponent;
import io.ermdev.classify.di.component.DaggerDatabaseComponent;
import io.ermdev.classify.di.component.DatabaseComponent;
import io.ermdev.classify.di.module.AppModule;
import io.ermdev.classify.di.module.DatabaseModule;

/**
 * Created by erafaelmanuel on 12/11/2017.
 */

public class BasicActivity extends AppCompatActivity {
    private AppComponent mAppComponent;
    private DatabaseComponent mDatabaseComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(getApplication()))
                .build();
        mDatabaseComponent = DaggerDatabaseComponent.builder()
                .appModule(new AppModule(getApplication()))
                .databaseModule(new DatabaseModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public DatabaseComponent getDatabaseComponent() {
        return mDatabaseComponent;
    }
}
