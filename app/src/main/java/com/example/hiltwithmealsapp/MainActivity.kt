package com.example.hiltwithmealsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel :MealsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rx : RecyclerView = findViewById(R.id.category_rv)
        val adapter = MealsAdapter()
        viewModel.getAllRemoteMeals()
        lifecycleScope.launch {
            viewModel.list.collect{
                adapter.submitList(it?.categories)
                rx.adapter = adapter
            }

        }
    }

}


