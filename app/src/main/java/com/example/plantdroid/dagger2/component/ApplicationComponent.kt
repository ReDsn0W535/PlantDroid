package com.example.plantdroid.dagger2.component

import android.app.Application
import com.example.plantdroid.dagger2.module.googleModule.GoogleModule
import com.example.plantdroid.view.base.BaseActivity
import com.example.plantdroid.view.main.MainActivity
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, GoogleModule::class])
public interface ApplicationComponent {
    fun inject(application: Application)
}