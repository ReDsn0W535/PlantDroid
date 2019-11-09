package com.example.plantdroid.signIn.ui

import androidx.lifecycle.ViewModelProviders
import com.example.plantdroid.BR
import com.example.plantdroid.ViewModelProviderFactory
import com.example.plantdroid.base.BaseFragment
import com.example.plantdroid.databinding.SignInFragmentBinding
import com.example.plantdroid.signIn.data.SignInViewModel
import javax.inject.Inject

class SignInFragment(layout : Int) : BaseFragment<SignInFragmentBinding, SignInViewModel>(layout){
    @Inject
    private lateinit var factory: ViewModelProviderFactory

    private lateinit var viewModel: SignInViewModel

    override fun getBindingVariable() = BR.viewModel

    override fun getViewModel(): SignInViewModel {
        viewModel = ViewModelProviders.of(this, factory).get(SignInViewModel::class.java)
        return viewModel
    }

}