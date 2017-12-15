package io.ermdev.classify.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

import io.ermdev.classify.R;
import io.ermdev.classify.data.local.user.Order;
import io.ermdev.classify.data.remote.client.UserClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class UserActivity extends BasicActivity {

    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getAppComponent().inject(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
//                UserClient userClient = retrofit.create(UserClient.class);
//                Call<User> call = userClient.getById(1);
//                call.enqueue(new Callback<User>() {
//                    @Override
//                    public void onResponse(Call<User> call, Response<User> response) {
//                        User user = response.body();
//                        Snackbar.make(view, user.toString(), Snackbar.LENGTH_LONG)
//                                .setAction("Action", null).show();
//                    }
//
//                    @Override
//                    public void onFailure(Call<User> call, Throwable t) {
//                        Snackbar.make(view, "Connection error", Snackbar.LENGTH_LONG)
//                                .setAction("Action", null).show();
//                    }
//                });

                UserClient userClient = retrofit.create(UserClient.class);
                Call<Order> call = userClient.getSomething();
                call.enqueue(new Callback<Order>() {
                    @Override
                    public void onResponse(Call<Order> call, Response<Order> response) {
                        Order order = response.body();
                        Snackbar.make(view, order.getMessage(), Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }

                    @Override
                    public void onFailure(Call<Order> call, Throwable t) {
                        Snackbar.make(view, "Connection error", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                });
            }
        });
    }

}
