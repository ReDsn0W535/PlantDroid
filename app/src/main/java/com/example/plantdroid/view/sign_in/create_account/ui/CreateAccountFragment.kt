package com.example.plantdroid.view.sign_in.create_account.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.plantdroid.BR
import com.example.plantdroid.ViewModelProviderFactory
import com.example.plantdroid.databinding.CreateAccountFragmentBinding
import com.example.plantdroid.view.base.BaseFragment
import com.example.plantdroid.view.base.BaseViewModel
import com.example.plantdroid.view.sign_in.create_account.data.CreateAccountViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import javax.inject.Inject

class CreateAccountFragment(layout: Int) :
    BaseFragment<CreateAccountFragmentBinding, CreateAccountViewModel>(layout) {

    @Inject
    lateinit var factory: ViewModelProviderFactory
    @Inject
    lateinit var googleOptions: GoogleSignInOptions

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private lateinit var createAccountViewModel: CreateAccountViewModel
    override fun getViewModel(): CreateAccountViewModel {
        createAccountViewModel =
            ViewModelProviders.of(this, factory).get(CreateAccountViewModel::class.java)
        return createAccountViewModel
    }

    override fun getBindingVariable() = BR.viewModel

}