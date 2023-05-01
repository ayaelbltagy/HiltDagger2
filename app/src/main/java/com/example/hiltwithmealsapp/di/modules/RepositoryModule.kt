package com.example.hiltwithmealsapp.di.modules

import com.example.hiltwithmealsapp.data.ApiService
import com.example.hiltwithmealsapp.repositories.MealRepository
import com.example.hiltwithmealsapp.repositories.MealsRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideRepository (apiService: ApiService): MealRepository {
        return MealsRepositoryImp(apiService)
    }

}