package io.classify.ui.home

import io.classify.data.model.User
import io.classify.data.remote.service.TeacherService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class HomeInteractImpl(private val teacherService: TeacherService) : HomeInteract {

    override fun findClasses(user: User, listener: HomeInteract.OnFinishedListener) {
        teacherService.getById(1L)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    listener.onShowClassesSuccess(teacher = result)
                }, {
                    listener.onShowClassesError()
                })
    }

    override fun findProfile(user: User, listener: HomeInteract.OnFinishedListener) {
        teacherService.getById(1L)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    listener.onShowProfileSuccess(teacher = result)
                }, {
                    listener.onShowProfileError()
                })
    }
}