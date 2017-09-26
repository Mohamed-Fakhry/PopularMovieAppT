package com.example.hamza.popularmovieapp.ui.movies.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.hamza.popularmovieapp.R;
import com.example.hamza.popularmovieapp.model.Movie;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MovieVH> {

    ArrayList<Movie> movies;

    public MoviesAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public MovieVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MovieVH(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_movie, null));
    }

    @Override
    public void onBindViewHolder(MovieVH holder, int position) {
        holder.setMovieView(movies.get(position));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
