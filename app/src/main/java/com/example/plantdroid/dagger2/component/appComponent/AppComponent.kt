package com.example.plantdroid.dagger2.component.appComponent

import com.example.plantdroid.dagger2.module.googleModule.GoogleModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, GoogleModule::class])
public interface AppComponent {

}