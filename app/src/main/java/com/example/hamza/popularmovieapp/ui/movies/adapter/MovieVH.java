package com.example.hamza.popularmovieapp.ui.movies.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hamza.popularmovieapp.R;
import com.example.hamza.popularmovieapp.model.Movie;

import butterknife.BindView;
import butterknife.ButterKnife;

class MovieVH extends RecyclerView.ViewHolder {

    @BindView(R.id.movieIV)
    ImageView movieIV;
    @BindView(R.id.titleTV)
    TextView titleTV;

    public MovieVH(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    void setMovieView(Movie movieView) {
        Glide.with(itemView.getContext())
                .load("http://image.tmdb.org/t/p/w185/" + movieView.getPosterPath())
                .into(movieIV);

        titleTV.setText(movieView.getTitle());
    }
}
