package io.ermdev.classify.di.module;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import io.ermdev.mapfierj.SimpleMapper;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by erafaelmanuel on 11/28/2017.
 */

@Module
public class AppModule {

    private Application mApplication;

    public AppModule(Application mApplication){
        this.mApplication = mApplication;
    }

    @Provides
    public Application providesApplication() {
        return mApplication;
    }

    @Provides
    public SimpleMapper providesSimpleMapper() {
        return new SimpleMapper();
    }

    @Provides
    public String providesBaseUrl() {
        return "http://192.168.0.101:3000/";
    }

    @Provides
    public Retrofit.Builder providesRetrofitBuilder(String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create());
    }

    @Provides
    public Retrofit providesRetrofit(Retrofit.Builder builder) {
        return builder.build();
    }
}
