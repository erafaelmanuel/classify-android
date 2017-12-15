package io.ermdev.classify.di.module;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by erafaelmanuel on 12/15/2017.
 */

@Module
public class RestClientModule {

    private static final String BASE_URL = "http://192.168.0.101:3000/";

    @Provides
    public Retrofit.Builder providesRetrofitBuilder() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());
    }

    @Provides
    public Retrofit providesRetrofit(Retrofit.Builder builder) {
        return builder.build();
    }
}
