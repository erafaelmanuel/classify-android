package io.ermdev.classify.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.ermdev.classify.R;

/**
 * Created by erafaelmanuel on 11/26/2017.
 */
class MainActivityK : AppCompatActivity(), MainScreen {

    var presenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_k);
    }
}
