package com.example.plantdroid.view.sign_in.main_sign_in.ui

import androidx.lifecycle.ViewModelProviders
import com.example.plantdroid.BR
import com.example.plantdroid.ViewModelProviderFactory
import com.example.plantdroid.view.base.BaseFragment
import com.example.plantdroid.databinding.SignInFragmentBinding
import com.example.plantdroid.view.sign_in.create_account.ui.CreateAccountFragment
import com.example.plantdroid.view.sign_in.main_sign_in.data.MainSignInNavigator
import com.example.plantdroid.view.sign_in.main_sign_in.data.MainSignInViewModel
import javax.inject.Inject

class MainSignInFragment(layout : Int) : BaseFragment<SignInFragmentBinding, MainSignInViewModel>(layout),
    MainSignInNavigator {
    @Inject
    lateinit var factory: ViewModelProviderFactory

    private lateinit var viewModelMain: MainSignInViewModel

    override fun getBindingVariable() = BR.viewModel

    override fun getViewModel(): MainSignInViewModel {
        viewModelMain = ViewModelProviders.of(this, factory).get(MainSignInViewModel::class.java)
        return viewModelMain
    }

    override fun createAccount() {
        //rootActivity.addFragment(, "createAccount")
    }

    override fun signIn() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}