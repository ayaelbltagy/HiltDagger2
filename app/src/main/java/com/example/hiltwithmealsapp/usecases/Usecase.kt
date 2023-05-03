package com.example.hiltwithmealsapp.usecases

import com.example.hiltwithmealsapp.repositories.MealRepository
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

class Usecase @Inject constructor (private val repo: MealRepository) {
        suspend operator fun invoke () = repo.getMealsFromRemote()
}