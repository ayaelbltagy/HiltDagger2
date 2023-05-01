package com.example.hiltwithmealsapp.di.modules

import com.example.hiltwithmealsapp.repositories.MealRepository
import com.example.hiltwithmealsapp.usecases.Usecase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UsecaseModule {

    @Provides
    fun provideUseCase(repo: MealRepository): Usecase {
        return Usecase(repo)
    }
}