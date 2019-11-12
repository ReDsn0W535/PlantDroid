package com.example.plantdroid.view

import android.app.Application
import com.example.plantdroid.dagger2.component.appComponent.AppComponent
import com.example.plantdroid.dagger2.component.appComponent.DaggerApplicationComponent
import com.example.plantdroid.dagger2.module.googleModule.GoogleModule

class PlantDroidApplication : Application() {

    protected fun buildComponent() : AppComponent = DaggerApplicationComponent.builder()
        .googleModule(GoogleModule())
        .build()
}