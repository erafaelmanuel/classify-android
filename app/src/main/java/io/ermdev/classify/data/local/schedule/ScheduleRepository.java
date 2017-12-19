package io.ermdev.classify.data.local.schedule;

import io.ermdev.classify.data.local.AppDatabase;
import io.ermdev.mapfierj.SimpleMapper;

/**
 * Created by Remsama on 12/19/2017.
 */

public class ScheduleRepository {

    private ScheduleDao scheduleDao;
    private SimpleMapper mapper;

    public ScheduleRepository(AppDatabase mAppDatabase) {
        this.scheduleDao = mAppDatabase.scheduleDao();
    }

    public ScheduleRepository(AppDatabase mAppDatabase, SimpleMapper mapper) {
        this.scheduleDao = mAppDatabase.scheduleDao();
        this.mapper = mapper;
    }

    public ScheduleDto findById(final long scheduleId) {
        return mapper.set(scheduleDao.findById(scheduleId)).mapTo(ScheduleDto.class);
    }
}
