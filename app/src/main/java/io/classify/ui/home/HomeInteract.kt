package io.classify.ui.home

import io.classify.data.model.Teacher
import io.classify.data.model.User

interface HomeInteract {

    interface OnFinishedListener {

        fun onShowClassesSuccess(teacher: Teacher)

        fun onShowClassesError()

        fun onShowProfileSuccess(teacher: Teacher)

        fun onShowProfileError()
    }

    fun findClasses(user: User, listener: OnFinishedListener)

    fun findProfile(user: User, listener: OnFinishedListener)
}