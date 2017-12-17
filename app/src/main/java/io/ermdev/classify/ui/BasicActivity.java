package io.ermdev.classify.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.ermdev.classify.di.component.AppComponent;
import io.ermdev.classify.di.component.DaggerAppComponent;
import io.ermdev.classify.di.component.DaggerPersistenceComponent;
import io.ermdev.classify.di.component.DaggerRestClientComponent;
import io.ermdev.classify.di.component.PersistenceComponent;
import io.ermdev.classify.di.component.RestClientComponent;
import io.ermdev.classify.di.module.AppModule;
import io.ermdev.classify.di.module.PersistenceModule;
import io.ermdev.classify.di.module.RestClientModule;

/**
 * Created by erafaelmanuel on 12/11/2017.
 */

public class BasicActivity extends AppCompatActivity {
    private AppComponent mAppComponent;
    private PersistenceComponent mPersistenceComponent;

    private RestClientComponent mRestClientComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(getApplication()))
                .build();
        mPersistenceComponent = DaggerPersistenceComponent.builder()
                .appModule(new AppModule(getApplication()))
                .persistenceModule(new PersistenceModule())
                .build();
        mRestClientComponent = DaggerRestClientComponent.builder()
                .restClientModule(new RestClientModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public PersistenceComponent getmPersistenceComponent() {
        return mPersistenceComponent;
    }

    public RestClientComponent getRestClientComponent() {
        return mRestClientComponent;
    }
}
