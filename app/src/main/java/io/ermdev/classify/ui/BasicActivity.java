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
 * Created by erafaelmanuel on 11/28/2017.
 */

public class BasicActivity extends AppCompatActivity {

    private AppComponent appComponent;
    private DatabaseComponent databaseComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(getApplication())).build();
        databaseComponent = DaggerDatabaseComponent.builder()
                .databaseModule(new DatabaseModule(getApplication())).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public DatabaseComponent getDatabaseComponent() {
        return databaseComponent;
    }
}
