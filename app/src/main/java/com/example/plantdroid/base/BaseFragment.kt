package com.example.plantdroid.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import dagger.android.support.AndroidSupportInjection

abstract class BaseFragment<T : ViewDataBinding, V : BaseViewModel<*>>(layout : Int) : Fragment(layout){

    private var mViewDataBinding: T? = null
    private var mViewModel: V? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        performDependencyInjection()
        super.onCreate(savedInstanceState)
        mViewModel = getViewModel()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewDataBinding?.apply {
            setVariable(getBindingVariable(), mViewModel)
            lifecycleOwner = this@BaseFragment
            executePendingBindings()
        }
    }

    abstract fun getViewModel(): V

    fun performDependencyInjection(){
        AndroidSupportInjection.inject(this)
    }

    abstract fun getBindingVariable(): Int

}