package io.classify.ui.home

import io.classify.data.model.Schedule

@Deprecated("unused")
interface HomeSchedulesInteract {

    interface OnFinishedListener {
        fun onFinished(schedules: List<Schedule>)
    }

    fun findSchedules(listener: OnFinishedListener);
}