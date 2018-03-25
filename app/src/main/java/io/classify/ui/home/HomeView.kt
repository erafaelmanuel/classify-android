package io.classify.ui.home

import io.classify.data.model.Teacher

interface HomeView {

    fun showProgress()

    fun hideProgress()

    fun navigateClasses(teacher: Teacher)

    fun navigateProfile(teacher: Teacher)

    fun setClassesError()

    fun setProfileError()
}