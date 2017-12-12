package io.ermdev.classify.ui.main;

import java.util.List;

import io.ermdev.classify.data.local.schedule.Schedule;

/**
 * Created by erafaelmanuel on 11/26/2017.
 */

public interface MainScreen {

    void loadSchedules(List<Schedule> schedules);

}
