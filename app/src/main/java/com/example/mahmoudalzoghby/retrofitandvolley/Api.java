package com.example.mahmoudalzoghby.retrofitandvolley;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel/")
    Call<List<Hero>> getHeros();
}
