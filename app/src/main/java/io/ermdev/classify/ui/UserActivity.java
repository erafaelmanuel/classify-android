package io.ermdev.classify.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

import io.ermdev.classify.R;
import io.ermdev.classify.data.local.user.User;
import io.ermdev.classify.data.remote.client.UserClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class UserActivity extends BasicActivity {

    @Inject
    Retrofit retrofit;
    User user_123 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getRestClientComponent().inject(this);

        final UserClient userClient = retrofit.create(UserClient.class);
        User user = new User();

        user.setUsername("ronaldmanuel123");
        user.setPassword("passwordabc");

        Call<User> callPost = userClient.addUser(user);

        callPost.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                user_123=response.body();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Call<User> callGet = userClient.getById(user_123.getId());
                callGet.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        Snackbar.make(view, response.body().toString(), Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Snackbar.make(view, "Connection error", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                });
            }
        });
    }

}
