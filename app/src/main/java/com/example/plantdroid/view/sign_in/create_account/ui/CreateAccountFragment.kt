package com.example.plantdroid.view.sign_in.create_account.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.plantdroid.BR
import com.example.plantdroid.R
import com.example.plantdroid.ViewModelProviderFactory
import com.example.plantdroid.databinding.CreateAccountFragmentBinding
import com.example.plantdroid.view.base.BaseFragment
import com.example.plantdroid.view.sign_in.create_account.data.CreateAccountViewModel
import javax.inject.Inject

class CreateAccountFragment(layout: Int) :
    BaseFragment<CreateAccountFragmentBinding, CreateAccountViewModel>(layout) {

    @Inject
    internal lateinit var factory: ViewModelProviderFactory
   /* @Inject
    lateinit var googleOptions: GoogleSignInOptions*/

    override fun getBindingVariable() = BR.viewModel
    override fun getLayoutId() = R.layout.create_account_fragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private lateinit var createAccountViewModel: CreateAccountViewModel
    override fun getViewModel(): CreateAccountViewModel {
        createAccountViewModel =
            ViewModelProviders.of(this, factory).get(CreateAccountViewModel::class.java)
        return createAccountViewModel
    }
}