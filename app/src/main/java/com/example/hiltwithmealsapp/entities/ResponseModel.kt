package com.example.hiltwithmealsapp.entities

data class ResponseModel(    val categories: List<Category>
) {
    data class Category(
        val idCategory: String,
        val strCategory: String,
        val strCategoryDescription: String,
        val strCategoryThumb: String
    )
}
