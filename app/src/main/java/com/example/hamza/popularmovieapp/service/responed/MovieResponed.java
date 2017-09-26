package com.example.hamza.popularmovieapp.service.responed;

import com.example.hamza.popularmovieapp.model.Movie;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MovieResponed {

    @SerializedName("results")
    ArrayList<Movie> movies;

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "MovieResponed{" +
                "movies=" + movies +
                '}';
    }
}
