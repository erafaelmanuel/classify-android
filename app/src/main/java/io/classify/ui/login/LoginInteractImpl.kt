package io.classify.ui.login

import android.os.Handler
import android.text.TextUtils
import io.classify.data.model.User
import io.classify.data.remote.service.UserService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class LoginInteractImpl(private val userService: UserService) : LoginInteract {

    override fun login(username: String, password: String, listener: LoginInteract.OnFinishedListener) {
        if (TextUtils.isEmpty(username)) {
            listener.onUsernameError()
            return
        }
        if (TextUtils.isEmpty(password)) {
            listener.onPasswordError()
            return
        }
        Handler().postDelayed({
            userService.getByUsername(username)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            { result ->
                                val user = result?: User()
                                if (user.password.equals(password)) {
                                    listener.onSuccess()
                                } else {
                                    listener.onFailure()
                                }
                            },
                            {
                                listener.onFailure()
                            })
        }, 500)
    }
}