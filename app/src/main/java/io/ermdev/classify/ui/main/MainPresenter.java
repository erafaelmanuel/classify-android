package io.ermdev.classify.ui.main;

import java.util.ArrayList;

import io.ermdev.classify.data.local.schedule.ScheduleDto;

/**
 * Created by erafaelmanuel on 11/26/2017.
 */
public class MainPresenter {

    private MainScreen mScreen;

    public MainPresenter(MainScreen mScreen) {
        this.mScreen = mScreen;
    }

    public void loadSchedules() {
        ArrayList<ScheduleDto> scheduleDtos = new ArrayList<>();
        ScheduleDto scheduleDto = new ScheduleDto();
        scheduleDto.setId(1);
        scheduleDto.setDay("Monday");
        scheduleDto.setStartTime("01:00 PM");
        scheduleDto.setEndTime("03:00 PM");

        ScheduleDto scheduleDto2 = new ScheduleDto();
        scheduleDto.setId(2);
        scheduleDto.setDay("Tuesday");
        scheduleDto.setStartTime("09:00 AM");
        scheduleDto.setEndTime("12:00 PM");

        scheduleDtos.add(scheduleDto);
        scheduleDtos.add(scheduleDto2);

        mScreen.showSchedules(scheduleDtos);
    }
}
