package com.doubleclick.learncompose.New.EffectHundler

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.doubleclick.learncompose.New.ViewModel.LaunchedEffectViewModel

@Composable
fun LaunchedEffectFlow(viewModel: LaunchedEffectViewModel) {
    LaunchedEffect(key1 = true) {
        viewModel.sharedFlow.collect { event ->
            when (event) {
                is LaunchedEffectViewModel.ScreenEvent.ShowSnackbar -> {

                }
                is LaunchedEffectViewModel.ScreenEvent.Navigation -> {

                }
            }
        }
    }
}