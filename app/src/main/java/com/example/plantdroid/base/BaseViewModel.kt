package com.example.plantdroid.base

import androidx.lifecycle.ViewModel
import java.lang.ref.WeakReference

abstract class BaseViewModel<T> : ViewModel(){
    var navigator : WeakReference<T>? = null

    fun setNavigator(navigator : T){
        this.navigator = WeakReference(navigator)
    }

    fun getNavigator() = navigator?.get()
}