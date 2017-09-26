package com.example.hamza.popularmovieapp.service;


import com.example.hamza.popularmovieapp.service.responed.MovieResponed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("upcoming?api_key=e0e7f86d51fd9f1c11d41bea49e14f25")
    Call<MovieResponed> getMovies();
}
