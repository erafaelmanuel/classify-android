package io.classify.ui.home

import io.classify.data.remote.service.TeacherService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class HomeInteractImpl(private val teacherService: TeacherService) : HomeInteract {

    override fun findClasses(userId: Long, listener: HomeInteract.OnFinishedListener) {
        teacherService.getByUserId(userId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    listener.onShowClassesSuccess(teacher = result)
                }, {
                    listener.onShowClassesError()
                })
    }

    override fun findProfile(userId: Long, listener: HomeInteract.OnFinishedListener) {
        teacherService.getByUserId(userId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    listener.onShowProfileSuccess(teacher = result)
                }, {
                    listener.onShowProfileError()
                })
    }
}