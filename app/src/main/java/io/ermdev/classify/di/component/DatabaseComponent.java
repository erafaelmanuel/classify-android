package io.ermdev.classify.di.component;

import dagger.Component;
import io.ermdev.classify.di.module.AppModule;
import io.ermdev.classify.di.module.DatabaseModule;
import io.ermdev.classify.ui.main.MainPresenter;

/**
 * Created by erafaelmanuel on 11/28/2017.
 */

@Component(modules = {AppModule.class, DatabaseModule.class})
public interface DatabaseComponent {

    void inject(MainPresenter mPresenter);
}
