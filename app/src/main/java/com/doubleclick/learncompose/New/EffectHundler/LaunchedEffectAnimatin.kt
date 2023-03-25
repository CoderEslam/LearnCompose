package com.doubleclick.learncompose.New.EffectHundler

import androidx.compose.animation.core.Animatable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember

@Composable
fun LaunchedEffectAnimatin(cunter: Int) {
    val animatable = remember {
        Animatable(0f)
    }
    LaunchedEffect(key1 = cunter) {
        animatable.animateTo(cunter.toFloat())
    }
}