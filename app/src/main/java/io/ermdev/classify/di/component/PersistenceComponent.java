package io.ermdev.classify.di.component;

import javax.inject.Singleton;

import dagger.Component;
import io.ermdev.classify.di.module.AppModule;
import io.ermdev.classify.di.module.PersistenceModule;
import io.ermdev.classify.ui.UserActivity;
import io.ermdev.classify.ui.main.MainPresenter;

/**
 * Created by erafaelmanuel on 12/17/2017.
 */

@Singleton
@Component(modules = {AppModule.class, PersistenceModule.class})
public interface PersistenceComponent {

    void inject(MainPresenter mMainPresenter);
    void inject(UserActivity mUserActivity);
}
