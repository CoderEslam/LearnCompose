package com.doubleclick.learncompose.New.EffectHundler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import kotlinx.coroutines.delay

class EffectHandlersActivity : ComponentActivity() {
    private val TAG = "EffectHandlersActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var text by remember {
                mutableStateOf("eslam")
            }
            LaunchedEffect(key1 = text) {
                delay(1000L)
                Log.e(TAG, "onCreate: $text")
            }

        }

    }
}