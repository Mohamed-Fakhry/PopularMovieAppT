package com.example.hamza.popularmovieapp.ui.movies;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hamza.popularmovieapp.App;
import com.example.hamza.popularmovieapp.R;
import com.example.hamza.popularmovieapp.model.Movie;
import com.example.hamza.popularmovieapp.service.responed.MovieResponed;
import com.example.hamza.popularmovieapp.ui.movies.adapter.MoviesAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoviesFragment extends Fragment {

    @BindView(R.id.moviesRV)
    RecyclerView moviesRV;

    MoviesAdapter moviesAdapter;

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
        getMovie();
        return view;
    }

    void getMovie() {
        App.service.getMovies().enqueue(new Callback<MovieResponed>() {
            @Override
            public void onResponse(Call<MovieResponed> call, Response<MovieResponed> response) {
                if (response.isSuccessful()) {
                    onSucess(response.body().getMovies());
                }
            }

            @Override
            public void onFailure(Call<MovieResponed> call, Throwable t) {

            }
        });
    }

    void onSucess(ArrayList<Movie> movies) {
        moviesAdapter = new MoviesAdapter(movies);
        moviesRV.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        moviesRV.setAdapter(moviesAdapter);
    }
}
