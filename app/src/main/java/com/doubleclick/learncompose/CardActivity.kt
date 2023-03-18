package com.doubleclick.learncompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage
import com.doubleclick.learncompose.ui.theme.LearnComposeTheme
import com.doubleclick.learncompose.views.GoogleButton
import com.doubleclick.learncompose.views.expandableCard
import com.doubleclick.learncompose.views.inputText

class CardActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterialApi::class, ExperimentalStdlibApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LearnComposeTheme {
                Column(modifier = Modifier.fillMaxSize()) {
                    expandableCard(titel = "Hello", description = "Good Morinng")
                    inputText(t = "Eslam", enabled = true, context = this@CardActivity)
                    GoogleButton(onClicked = {
                        Toast.makeText(
                            this@CardActivity,
                            "Creating Account ...$it",
                            Toast.LENGTH_SHORT
                        ).show()
                    })
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        AsyncImage(
                            model = "https://www.simplilearn.com/ice9/free_resources_article_thumb/what_is_image_Processing.jpg",
                            contentDescription = null
                        )
                    }
                }

            }

        }

    }
}