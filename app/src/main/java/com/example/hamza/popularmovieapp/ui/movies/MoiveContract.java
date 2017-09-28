package com.example.hamza.popularmovieapp.ui.movies;


import com.example.hamza.popularmovieapp.model.Movie;

import java.util.ArrayList;

public interface MoiveContract {
    interface View {

        void setMovies(ArrayList<Movie> movies);

        void setNoMovies();

        void showError();
    }

    interface Prsenter {

        void getMoives();

//    void saveMovie();
    }
}
