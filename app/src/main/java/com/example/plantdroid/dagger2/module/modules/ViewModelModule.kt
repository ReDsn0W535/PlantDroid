package com.example.plantdroid.dagger2.module.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.plantdroid.dagger2.scope.ViewModelKey
import com.example.plantdroid.ViewModelProviderFactory
import com.example.plantdroid.view.main.MainViewModel
import com.example.plantdroid.view.sign_in.create_account.data.CreateAccountViewModel
import com.example.plantdroid.view.sign_in.sign_in.data.SignInViewModel
import com.example.plantdroid.view.welcome.data.WelcomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module(subcomponents = [])
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(WelcomeViewModel::class)
    abstract fun bindWelcomeViewModel(viewModel : WelcomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel : MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SignInViewModel::class)
    abstract fun bindSignInViewModel(viewModel : SignInViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CreateAccountViewModel::class)
    abstract fun bindCreateAccountViewModel(viewModel : CreateAccountViewModel): ViewModel

}