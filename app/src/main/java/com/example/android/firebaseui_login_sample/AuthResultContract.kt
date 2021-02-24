package com.example.android.firebaseui_login_sample

import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import com.firebase.ui.auth.AuthUI

class AuthResultContract: ActivityResultContract<Int, AuthUI.IdpConfig>() {
    override fun createIntent(context: Context, input: Int?): Intent {
        TODO("Not yet implemented")
    }

    override fun parseResult(resultCode: Int, intent: Intent?): AuthUI.IdpConfig {
        TODO("Not yet implemented")
    }
}