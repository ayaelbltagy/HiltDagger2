package com.example.hiltwithmealsapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltwithmealsapp.entities.ResponseModel
import com.example.hiltwithmealsapp.usecases.Usecase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MealsViewModel  @Inject constructor (private val useCase: Usecase) : ViewModel() {

    private val _list : MutableStateFlow<ResponseModel?> = MutableStateFlow(null)
    val list : StateFlow<ResponseModel?> = _list
    fun getAllRemoteMeals(){
        viewModelScope.launch {
            try {
                _list.value = useCase()
            }catch (e: Exception){

            }
        }
    }
}
