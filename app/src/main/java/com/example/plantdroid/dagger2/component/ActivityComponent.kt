package com.example.plantdroid.dagger2.component

import com.example.plantdroid.dagger2.scope.PerActivity
import dagger.Component

@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [])
class ActivityComponent {

}