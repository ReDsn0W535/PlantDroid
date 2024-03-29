package com.example.plantdroid.dagger2.module.modules

import androidx.fragment.app.FragmentManager
import com.example.plantdroid.dagger2.scope.ActivityScope
import com.example.plantdroid.dagger2.scope.FragmentScope
import com.example.plantdroid.view.sign_in.create_account.ui.CreateAccountFragment
import com.example.plantdroid.view.sign_in.sign_in.ui.SignInFragment
import com.example.plantdroid.view.welcome.ui.WelcomeFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule{
    @ActivityScope
    @Binds
    fun provideFragmentManager(manager: FragmentManager) : FragmentManager

    @FragmentScope
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    fun weclomeFragment() : WelcomeFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    fun signInFragment() : SignInFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    fun createAccountFragment() : CreateAccountFragment
}