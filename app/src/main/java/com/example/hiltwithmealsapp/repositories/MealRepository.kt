package com.example.hiltwithmealsapp.repositories

import com.example.hiltwithmealsapp.entities.ResponseModel

interface MealRepository {
    // get all meals from server
    suspend fun getMealsFromRemote(): ResponseModel
}