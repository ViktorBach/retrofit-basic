package com.example.catfact

import retrofit2.http.GET

interface BoredApi {
    @GET("/api/activity/")
    suspend fun getBored(
    ): Bored
}