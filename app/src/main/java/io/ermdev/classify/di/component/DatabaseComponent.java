package io.ermdev.classify.di.component;

import dagger.Component;
import io.ermdev.classify.di.module.DatabaseModule;

/**
 * Created by Remsama on 11/28/2017.
 */

@Component(modules = {DatabaseModule.class})
public interface DatabaseComponent {

}
