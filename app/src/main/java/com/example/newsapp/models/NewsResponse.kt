package com.example.newsapp.models

import java.io.Serializable

data class NewsResponse(
    val status : String,
    val totalResult : Int,
    val articles: List<Articles>

) : Serializable

data class Articles(
    val author : String ,
    val title : String,
    val description : String,
    val url : String,
    val urlTolmage : String,
    val publishedAt : String,
    val content : String,
    val source : List<Source>
)

data class Source(
    val id: String,
    val name : String
)