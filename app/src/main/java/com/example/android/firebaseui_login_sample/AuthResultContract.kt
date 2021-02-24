package com.example.android.firebaseui_login_sample

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.IdpResponse

class AuthResultContract : ActivityResultContract<Int, IdpResponse>() {

    companion object {
        const val INPUT_KEY = "input_key"
    }

    //create providers
    private val providers =
        listOf(AuthUI.IdpConfig.GoogleBuilder().build(), AuthUI.IdpConfig.EmailBuilder().build())



    override fun createIntent(context: Context, input: Int?): Intent {
        return AuthUI.getInstance().createSignInIntentBuilder()
            .setLogo(R.drawable.ic_launcher_background)
            .setTheme(R.style.AppTheme)
            .setAvailableProviders(providers)
            .setIsSmartLockEnabled(true)
            .build().apply { putExtra(INPUT_KEY, input) }
    }



    override fun parseResult(resultCode: Int, intent: Intent?): IdpResponse? {

        return when (resultCode ){

            Activity.RESULT_OK -> IdpResponse.fromResultIntent(intent)
            else -> null
        }

    }





}
