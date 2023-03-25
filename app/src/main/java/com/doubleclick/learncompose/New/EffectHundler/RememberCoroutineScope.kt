package com.doubleclick.learncompose.New.EffectHundler

import android.util.Log
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.RememberObserver
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun RememberCoroutineScope() {
    val scope = rememberCoroutineScope()
    Button(onClick = {
        scope.launch {
            delay(1000L)
            Log.e("RememberCoroutineScope", "Goooooood ")
        }
    }) {

    }
}