package io.ermdev.classify.di.component;

import dagger.Component;
import io.ermdev.classify.di.module.RestClientModule;
import io.ermdev.classify.ui.UserActivity;

/**
 * Created by Remsama on 12/15/2017.
 */

@Component(modules = {RestClientModule.class})
public interface RestClientComponent {

    void inject(UserActivity mUserActivity);
}
