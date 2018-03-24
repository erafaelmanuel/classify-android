package io.classify.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import io.classify.R
import io.classify.data.remote.service.UserService
import io.classify.ui.BaseActivity
import io.classify.ui.home.HomeActivity
import retrofit2.Retrofit
import javax.inject.Inject

class LoginActivity : BaseActivity(), LoginView, View.OnClickListener {

    @Inject
    lateinit var retrofit: Retrofit

    private lateinit var message: TextView

    private lateinit var progressBar: ProgressBar

    private lateinit var txUsername: EditText

    private lateinit var txPassword: EditText

    private lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        appComponent.inject(this)

        val userService = retrofit.create(UserService::class.java)

        presenter = LoginPresenterImpl(this, LoginInteractImpl(userService))

        progressBar = findViewById<ProgressBar>(R.id.progress)

        txUsername = findViewById<EditText>(R.id.username)

        txPassword = findViewById<EditText>(R.id.password)

        message = findViewById<TextView>(R.id.message)

        (findViewById<Button>(R.id.button)).setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        presenter.validateCredentials(txUsername.text.toString(), txPassword.text.toString());
    }

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE;
        message.visibility = View.INVISIBLE;
    }

    override fun hideProgress() {
        progressBar.visibility = View.INVISIBLE;
    }

    override fun setUsernameError() {
        txUsername.error = getString(R.string.error_empty_username);
    }

    override fun setPasswordError() {
        txPassword.error = getString(R.string.error_empty_password);
    }

    override fun setLoginError() {
        message.visibility = View.VISIBLE
    }

    override fun navigateToHome() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }
}
