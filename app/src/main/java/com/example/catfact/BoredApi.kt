package com.example.catfact

import retrofit2.http.GET
import retrofit2.http.Query

interface BoredApi {
    @GET("/api/activity/")
    suspend fun getBored(
    ): Bored

    @GET("/api/activity/")
    suspend fun getBoredParticipants(@Query("participants") participants: Int,): Bored
    @GET("/api/activity/")
    suspend fun getBoredAccessibility(@Query("accessibility") accessibility: Double,
                          @Query("minprice") minPrice: Double,
                          @Query("maxprice") maxPrice: Double
    ): Bored
}