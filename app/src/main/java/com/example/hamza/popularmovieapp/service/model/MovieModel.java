package com.example.hamza.popularmovieapp.service.model;


import com.example.hamza.popularmovieapp.model.Movie;

import java.util.ArrayList;

public interface MovieModel {

    interface OnGetMovies {
        void onSucess(ArrayList<Movie> movies);

        void onFail();
    }

    void getMovies(OnGetMovies lisenter);
}
