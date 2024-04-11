package com.example.catfact

import android.os.Build
import androidx.annotation.RequiresExtension
import kotlinx.coroutines.runBlocking

fun main() {
    //Exercise 1
    runBlocking {
        val instance = RetrofitInstance()
        val bored = instance.apiService.getBored()
        println(bored)
    //Exercise 2
        getParticipants()
    //Exercise 3
        getAccessibility()
    }
}

//Exercise 2
fun getParticipants () {
        runBlocking {
            println("Enter the number of participants:")
            val participants = readlnOrNull()?.toIntOrNull() ?: 1

            val instance = RetrofitInstance()
            val bored = instance.apiService.getBoredParticipants(participants)
            println(bored)
        }
}

//Exercise 3
fun getAccessibility () {
    runBlocking {
        println("Enter the accessibility (0.0 to 1.0):")
        val accessibility = readln().toDouble()

        println("Enter the minimum price (0 to 1):")
        val minPrice = readln().toDouble()

        println("Enter the maximum price (0 to 1):")
        val maxPrice = readln().toDouble()

        val instance = RetrofitInstance()
        val response = instance.apiService.getBoredAccessibility(accessibility, minPrice, maxPrice)
        if (response.activity == null) {
            println("failure")
        } else {
            println(response.activity)
        }
    }
}