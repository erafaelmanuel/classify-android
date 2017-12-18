package io.ermdev.classify.viewmodel;

import android.databinding.BaseObservable;

import io.ermdev.classify.R;
import io.ermdev.classify.data.local.user.User;

/**
 * Created by erafaelmanuel on 12/18/2017.
 */

public class UserViewModel extends BaseObservable {

    private String username;
    private String password;
    private String usernameHint;
    private String passwordHint;

    public UserViewModel(User user) {
        setUsername(user.getUsername());
        setPassword(user.getPassword());
        setUsernameHint("Enter a username");
        setPasswordHint("Enter a password");
    }

    public String getUsername() {
        notifyPropertyChanged(R.id.username);
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        notifyPropertyChanged(R.id.password);
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsernameHint() {
        return usernameHint;
    }

    public void setUsernameHint(String usernameHint) {
        this.usernameHint = usernameHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }
}
