package com.example.plantdroid

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.plantdroid.view.sign_in.create_account.data.CreateAccountViewModel
import com.example.plantdroid.view.sign_in.main_sign_in.data.MainSignInViewModel

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by jyotidubey on 22/02/19.
 */
@Singleton
class ViewModelProviderFactory @Inject constructor(): ViewModelProvider.NewInstanceFactory() {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainSignInViewModel::class.java)) {

            return MainSignInViewModel(/*dataManager, schedulerProvider*/) as T
        } else if (modelClass.isAssignableFrom(CreateAccountViewModel::class.java))
            return CreateAccountViewModel() as T
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}