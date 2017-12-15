package io.ermdev.classify.data.remote.client;

import io.ermdev.classify.data.local.user.Order;
import io.ermdev.classify.data.local.user.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by erafaelmanuel on 12/15/2017.
 */

public interface UserClient {

    @GET("/user/{userId}")
    Call<User> getById(@Path("userId") long userId);

    @GET("orders")
    Call<Order> getSomething();
}
