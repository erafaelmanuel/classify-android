package io.classify.ui.login

import io.classify.data.model.User

interface LoginView {

    fun showProgress()

    fun hideProgress()

    fun setUsernameError()

    fun setPasswordError()

    fun setLoginError();

    fun navigateToHome(user: User)
}