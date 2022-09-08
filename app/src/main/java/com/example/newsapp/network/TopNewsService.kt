package com.example.newsapp.network

import com.example.newsapp.models.NewsResponse
import retrofit.Call
import retrofit.http.GET
import retrofit.http.Query

interface TopNewsService {

    @GET("top-headlines")
    fun getHeadLineNews(
        @Query("country") country : String,
        @Query("apiKey") apiKey : String

    ) : Call<NewsResponse>
}