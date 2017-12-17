package io.ermdev.classify.ui.main;

import javax.inject.Inject;

import io.ermdev.classify.di.component.PersistenceComponent;
import io.ermdev.mapfierj.SimpleMapper;

/**
 * Created by erafaelmanuel on 11/26/2017.
 */
public class MainPresenter {

    private MainScreen mScreen;

    @Inject
    public SimpleMapper mapper;

    public MainPresenter(MainScreen mScreen) {
        this.mScreen = mScreen;
    }

    public MainPresenter(MainScreen mScreen, PersistenceComponent mPersistenceComponent) {
        this(mScreen);
        mPersistenceComponent.inject(this);
    }

    public void onLoadSchedules() {


    }
}
