package com.doubleclick.learncompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import com.doubleclick.learncompose.ui.theme.LearnComposeTheme
import com.doubleclick.learncompose.views.expandableCard

class CardActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LearnComposeTheme {

                expandableCard(titel = "Hello", description = "Good Morinng")

            }

        }

    }
}