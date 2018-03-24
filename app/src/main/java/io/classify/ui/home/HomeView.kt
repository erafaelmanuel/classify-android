package io.classify.ui.home

import io.classify.data.model.Teacher

interface HomeView {

    fun showProgress()

    fun hideProgress()

    fun navigateProfile(teacher: Teacher)

    fun navigateClasses(teacher: Teacher)
}