package io.classify.ui.home

import io.classify.data.model.Teacher
import io.classify.data.model.User

class HomePresenterImpl(private val homeView: HomeView,
                        private val homeInteract: HomeInteractImpl) :
        HomePresenter, HomeInteract.OnFinishedListener {

    override fun showClasses(userId: Long) {
        homeView.showProgress()
        homeInteract.findClasses(userId, this)
    }

    override fun showProfile(userId: Long) {
        homeView.showProgress()
        homeInteract.findProfile(userId, this)
    }

    override fun onShowClassesSuccess(teacher: Teacher) {
        homeView.hideProgress()
        homeView.navigateClasses(teacher)
    }

    override fun onShowClassesError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onShowProfileSuccess(teacher: Teacher) {
        homeView.hideProgress()
        homeView.navigateProfile(teacher)
    }

    override fun onShowProfileError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}