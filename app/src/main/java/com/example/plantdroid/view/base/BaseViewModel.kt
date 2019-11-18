package com.example.plantdroid.view.base

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import java.lang.ref.WeakReference

abstract class BaseViewModel<T : BaseNavigator>(var context: Context) : AndroidViewModel(context as Application), LifecycleObserver{
    private var navigator : WeakReference<T>? = null

    fun setNavigator(navigator : T){
        this.navigator = WeakReference(navigator)
    }

    fun getNavigator() = navigator?.get()
}