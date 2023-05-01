package com.example.hiltwithmealsapp.data

import com.example.hiltwithmealsapp.entities.ResponseModel
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getMeals(): ResponseModel
}