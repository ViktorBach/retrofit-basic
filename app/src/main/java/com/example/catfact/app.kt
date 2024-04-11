package com.example.catfact

import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val instance = RetrofitInstance()
        val bored = instance.apiService.getBored()
        println(bored)
    }
}