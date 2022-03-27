package com.touch.showmovies.model;


import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.Call;

public interface MovieService {
    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);
}
