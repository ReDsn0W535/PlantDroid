package com.example.plantdroid.view.sign_in.main_sign_in.navigator

interface MainSignInNavigator {
    fun login()
    fun handleError(throwable: Throwable)
}