package com.example.hamza.popularmovieapp.service.model;

import com.example.hamza.popularmovieapp.App;
import com.example.hamza.popularmovieapp.service.responed.MovieResponed;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieModelImpl implements MovieModel {

    @Override
    public void getMovies(final OnGetMovies lisenter) {
        App.service.getMovies().enqueue(new Callback<MovieResponed>() {
            @Override
            public void onResponse(Call<MovieResponed> call, Response<MovieResponed> response) {
                if (response.isSuccessful()) {
                    lisenter.onSucess(response.body().getMovies());
                }
            }

            @Override
            public void onFailure(Call<MovieResponed> call, Throwable t) {
                lisenter.onFail();
            }
        });

    }
}
