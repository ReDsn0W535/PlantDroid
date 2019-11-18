package com.example.plantdroid.view.welcome.data

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import androidx.security.crypto.EncryptedSharedPreferences
import com.example.plantdroid.R
import com.example.plantdroid.view.base.BaseViewModel
import com.example.plantdroid.view.welcome.navigator.WelcomeNavigator
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import javax.inject.Inject

class WelcomeViewModel @Inject constructor(
    context: Context, var googleSignInClient: GoogleSignInClient,
    var preferences: SharedPreferences) :
    BaseViewModel<WelcomeNavigator>(context) {

    public fun signIn() {
        getNavigator()?.signIn()
    }

    public fun createAccount() {
        getNavigator()?.createAccount()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    internal fun checkOnLogin() {
        Log.e("KEK", "PEK")
        if (preferences.getBoolean(
                context.getString(R.string.preferences_is_login_completed),
                false
            )
        )
            signIn()
    }

}