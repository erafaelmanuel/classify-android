package io.ermdev.classify.ui.main;

import java.util.ArrayList;

import javax.inject.Inject;

import io.ermdev.classify.data.local.schedule.Schedule;
import io.ermdev.classify.data.local.schedule.ScheduleDao;
import io.ermdev.classify.data.local.schedule.ScheduleDto;
import io.ermdev.classify.di.component.DatabaseComponent;
import io.ermdev.mapfierj.SimpleMapper;

/**
 * Created by erafaelmanuel on 11/26/2017.
 */
public class MainPresenter {

    private MainScreen mScreen;

    @Inject
    public ScheduleDao scheduleDao;

    @Inject
    public SimpleMapper mapper;

    public MainPresenter(MainScreen mScreen) {
        this.mScreen = mScreen;
    }

    public MainPresenter(MainScreen mScreen, DatabaseComponent mDatabaseComponent) {
        this(mScreen);
        mDatabaseComponent.inject(this);
    }

    public void onLoadSchedules() {
        ArrayList<ScheduleDto> schedules = new ArrayList<>();
        Schedule schedule = scheduleDao.findById((long)1);
//        schedule.setId(1);
//        schedule.setDay("Object Oriented Programming 2");
//        schedule.setRoom("Room CS 101");
//        schedule.setStartTime("01:00 PM");
//        schedule.setEndTime("03:00 PM");
//
        Schedule schedule1 = scheduleDao.findById((long)2);
//        schedule1.setId(2);
//        schedule1.setDay("English 1");
//        schedule1.setRoom("Room CS 102");
//        schedule1.setStartTime("09:00 AM");
//        schedule1.setEndTime("12:00 PM");

//        scheduleDao.save(schedule);
//        scheduleDao.save(schedule1);

        schedules.add(mapper.set(schedule).mapTo(ScheduleDto.class));
        schedules.add(mapper.set(schedule1).mapTo(ScheduleDto.class));

        mScreen.showSchedules(schedules);
    }
}
