package com.example.hamza.popularmovieapp.ui.movies;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamza.popularmovieapp.R;
import com.example.hamza.popularmovieapp.model.Movie;
import com.example.hamza.popularmovieapp.ui.movies.adapter.MoviesAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoviesFragment extends Fragment implements MoiveContract.View {

    @BindView(R.id.moviesRV)
    RecyclerView moviesRV;

    MoviesAdapter moviesAdapter;
    MoiveContract.Prsenter moviePrsenter;

    public MoviesFragment() {}

    public static MoviesFragment newInstance() {
        return new MoviesFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        ButterKnife.bind(this, view);
        moviePrsenter = new MoviePresenter(this);
        moviePrsenter.getMoives();
        return view;
    }

    @Override
    public void setMovies(ArrayList<Movie> movies) {
        moviesAdapter = new MoviesAdapter(movies);
        moviesRV.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        moviesRV.setAdapter(moviesAdapter);
    }

    @Override
    public void setNoMovies() {

    }

    @Override
    public void showError() {

    }
}
