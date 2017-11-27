package io.ermdev.classify.di.component;

import dagger.Component;
import io.ermdev.classify.di.module.AppModule;
import io.ermdev.classify.ui.main.MainActivity;

/**
 * Created by erafaelmanuel on 11/28/2017.
 */

@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
