package com.example.hamza.popularmovieapp.ui.movies;

import com.example.hamza.popularmovieapp.model.Movie;
import com.example.hamza.popularmovieapp.service.model.MovieModel;
import com.example.hamza.popularmovieapp.service.model.MovieModelImpl;

import java.util.ArrayList;

public class MoviePresenter implements MoiveContract.Prsenter, MovieModel.OnGetMovies {

    MoiveContract.View movieView;
    MovieModel movieModel;


    public MoviePresenter(MoiveContract.View movieView) {
        this.movieView = movieView;
        movieModel = new MovieModelImpl();
    }

    @Override
    public void getMoives() {
        movieModel.getMovies(this);
    }

    @Override
    public void onSucess(ArrayList<Movie> movies) {
        movieView.setMovies(movies);
    }

    @Override
    public void onFail() {
        movieView.showError();
    }
}
