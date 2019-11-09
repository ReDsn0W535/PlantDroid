package com.example.plantdroid

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.plantdroid.signIn.data.SignInViewModel

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by jyotidubey on 22/02/19.
 */
@Singleton
class ViewModelProviderFactory @Inject constructor(): ViewModelProvider.NewInstanceFactory() {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SignInViewModel::class.java)) {

            return SignInViewModel(/*dataManager, schedulerProvider*/) as T
        } /*else if (modelClass.isAssignableFrom(SearchViewModel::class.java))
            return SearchViewModel() as T*/
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}