package com.example.plantdroid.view.base

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.FragmentManager

abstract class BaseActivity<T : ViewDataBinding, V : BaseViewModel<*>> : AppCompatActivity(){
    private var fragmentManager : FragmentManager
    private lateinit var dataBinding : T
    private lateinit var viewModel : V

    abstract fun getBindingVariable(): Int

    @LayoutRes
    abstract fun getLayoutId(): Int

    abstract fun getViewModel(): V


    init {
        fragmentManager = supportFragmentManager
    }

    public fun addFragment(fragment: BaseFragment<*,*>, tag : String) = fragmentManager.beginTransaction().add(fragment, tag).commit()
    public fun replaceFragment(fragment: BaseFragment<*,*>, tag : String, id : Int) = fragmentManager.beginTransaction().replace(id, fragment, tag).commit()
    public fun removeFragment(fragment: BaseFragment<*,*>) = fragmentManager.beginTransaction().remove(fragment).commit()
}