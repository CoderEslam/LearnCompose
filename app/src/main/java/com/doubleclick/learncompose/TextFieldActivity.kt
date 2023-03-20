package com.doubleclick.learncompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.doubleclick.learncompose.ui.theme.LearnComposeTheme
import com.doubleclick.learncompose.views.GradientButton

class TextFieldActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnComposeTheme {
                Textfield()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Textfield() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var password by rememberSaveable {
            mutableStateOf("")
        }
        var passwordVisiablity by rememberSaveable {
            mutableStateOf(false)
        }

        val icon = if (passwordVisiablity) {
            painterResource(id = R.drawable.ic_baseline_visibility)
        } else {
            painterResource(id = R.drawable.ic_baseline_visibility_off_24)
        }
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Password") },
            label = { Text(text = "Password") },
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisiablity = !passwordVisiablity
                }) {
                    Icon(
                        painter = icon,
                        contentDescription = "Visible icon"
                    )
                }
            },
            visualTransformation = if (passwordVisiablity) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            }
        )
        GradientButton(
            text = "Button",
            textColor = Color.LightGray,
            gradient = Brush.horizontalGradient(colors = listOf(Color.Cyan, Color.Green))
        ) {

        }
    }
}