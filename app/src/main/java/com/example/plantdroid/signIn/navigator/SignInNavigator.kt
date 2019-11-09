package com.example.plantdroid.signIn.navigator

interface SignInNavigator {
    fun login()
    fun handleError(throwable: Throwable)
}