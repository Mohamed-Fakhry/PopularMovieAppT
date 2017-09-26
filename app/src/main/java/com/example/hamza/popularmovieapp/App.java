package com.example.hamza.popularmovieapp;

import android.app.Application;

import com.example.hamza.popularmovieapp.service.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.hamza.popularmovieapp.service.Constant.BASE_URL;


public class App extends Application {

    public static Service service;

    @Override
    public void onCreate() {
        super.onCreate();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(Service.class);
    }
}
