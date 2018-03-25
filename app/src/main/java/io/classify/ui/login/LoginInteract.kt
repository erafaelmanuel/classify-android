package io.classify.ui.login

import io.classify.data.model.User

interface LoginInteract {

    interface OnFinishedListener {

        fun onUsernameError()

        fun onPasswordError()

        fun onSuccess(user: User)

        fun onFailure()
    }

    fun login(username: String, password: String, listener: OnFinishedListener)
}