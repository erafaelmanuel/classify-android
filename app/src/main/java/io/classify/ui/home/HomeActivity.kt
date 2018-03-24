package io.classify.ui.home

import android.os.Bundle
import io.classify.R
import io.classify.data.model.Teacher
import io.classify.ui.BaseActivity
import retrofit2.Retrofit
import javax.inject.Inject

class HomeActivity : BaseActivity(), HomeView {

    @Inject
    lateinit var retrofit: Retrofit

    private lateinit var presenter: HomePresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        appComponent.inject(this)
    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun navigateProfile(teacher: Teacher) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun navigateClasses(teacher: Teacher) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
