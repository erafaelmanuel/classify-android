package io.ermdev.classify.ui.main

import android.app.Application
import android.os.Bundle
import io.ermdev.classify.R
import io.ermdev.classify.ui.BasicActivity
import javax.inject.Inject

class MainActivity : BasicActivity() {

    @Inject
    lateinit var app: Application

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appComponent.inject(this);
    }
}
