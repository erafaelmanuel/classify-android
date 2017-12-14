package io.ermdev.classify.ui.main;

import java.util.ArrayList;

import io.ermdev.classify.data.local.schedule.ScheduleDto;

/**
 * Created by erafaelmanuel on 11/26/2017.
 */

public interface MainScreen {

    void showSchedules(ArrayList<ScheduleDto> schedules);

}
