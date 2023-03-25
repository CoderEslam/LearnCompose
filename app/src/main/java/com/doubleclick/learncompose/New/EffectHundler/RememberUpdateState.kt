package com.doubleclick.learncompose.New.EffectHundler

import android.util.Log
import androidx.compose.material.Button
import androidx.compose.runtime.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun RememberUpdateState(onTimeout: () -> Unit) {

    val updateOnTime by rememberUpdatedState(newValue = onTimeout)
    LaunchedEffect(key1 = true) {
        delay(3000L)
        updateOnTime()
    }

}