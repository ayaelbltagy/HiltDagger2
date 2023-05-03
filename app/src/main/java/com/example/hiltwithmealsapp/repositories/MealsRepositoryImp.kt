package com.example.hiltwithmealsapp.repositories

import com.example.hiltwithmealsapp.data.ApiService
import com.example.hiltwithmealsapp.entities.ResponseModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

class MealsRepositoryImp  @Inject constructor(private val api: ApiService) : MealRepository {
    override suspend fun getMealsFromRemote(): ResponseModel = api.getMeals()
}