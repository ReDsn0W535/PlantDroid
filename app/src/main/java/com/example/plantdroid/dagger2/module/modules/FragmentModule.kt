package com.example.plantdroid.dagger2.module.modules

import com.example.plantdroid.view.sign_in.create_account.ui.CreateAccountFragment
import com.example.plantdroid.view.sign_in.sign_in.ui.SignInFragment
import com.example.plantdroid.view.welcome.ui.WelcomeFragment
import dagger.Binds
import dagger.Module
import dagger.Subcomponent

@Module
interface FragmentModule {

    @Binds
    fun bindWelcomeFragment(welcomeFragment: WelcomeFragment) : WelcomeFragment

    @Binds
    fun bindCreateAccountFragment(createAccountFragment: CreateAccountFragment) : CreateAccountFragment

    @Binds
    fun bindSignInFragment(signInFragment: SignInFragment) : SignInFragment
}
