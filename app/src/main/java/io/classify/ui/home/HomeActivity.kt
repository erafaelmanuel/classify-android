package io.classify.ui.home

import android.os.Bundle
import android.support.v7.widget.CardView
import android.util.Log
import android.view.View
import android.widget.Toast
import io.classify.R
import io.classify.data.model.Teacher
import io.classify.data.remote.service.TeacherService
import io.classify.ui.BaseActivity
import retrofit2.Retrofit
import javax.inject.Inject

class HomeActivity : BaseActivity(), HomeView, View.OnClickListener {

    @Inject
    lateinit var retrofit: Retrofit

    private lateinit var presenter: HomePresenterImpl

    private var userId: Long = 0

    private lateinit var classes: CardView

    private lateinit var profile: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        appComponent.inject(this)

        val teacherService = retrofit.create(TeacherService::class.java)

        userId = intent.getLongExtra("userId", 0)

        presenter = HomePresenterImpl(this, HomeInteractImpl(teacherService))

        classes = findViewById<CardView>(R.id.classes_cardId)

        profile = findViewById<CardView>(R.id.profile_cardId)

        classes.setOnClickListener(this)
        profile.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.classes_cardId -> presenter.showClasses(userId)
            R.id.profile_cardId -> presenter.showProfile(userId)
        }
    }

    override fun showProgress() {
        Log.i("", "")
    }

    override fun hideProgress() {
        Log.i("", "")
    }

    override fun navigateProfile(teacher: Teacher) {
        Toast.makeText(this, teacher.name, Toast.LENGTH_LONG).show()
    }

    override fun navigateClasses(teacher: Teacher) {
        Toast.makeText(this, teacher.name, Toast.LENGTH_LONG).show()
    }
}
