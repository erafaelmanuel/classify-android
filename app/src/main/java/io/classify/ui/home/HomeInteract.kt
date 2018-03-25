package io.classify.ui.home

import io.classify.data.model.Teacher

interface HomeInteract {

    interface OnFinishedListener {

        fun onShowClassesSuccess(teacher: Teacher)

        fun onShowClassesError()

        fun onShowProfileSuccess(teacher: Teacher)

        fun onShowProfileError()
    }

    fun findClasses(userId: Long, listener: OnFinishedListener)

    fun findProfile(userId: Long, listener: OnFinishedListener)
}