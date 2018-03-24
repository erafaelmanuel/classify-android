package io.classify.ui.home

import io.classify.data.model.User

interface HomePresenter {

    fun showClasses(user: User)

    fun showProfile(user: User)
}
