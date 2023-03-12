package com.doubleclick.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doubleclick.learncompose.ui.theme.LearnComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
//                        MyCompose()
                        Greeting("Android")
                        TextF()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnComposeTheme {
        Greeting("Android")
    }
}

@Composable
fun MyCompose() {
    var myValue by remember {
        mutableStateOf(false)
    }
    Button(
        onClick = { myValue = !myValue }, modifier = Modifier
            .height(50.dp)
            .width(100.dp)
    ) {
        Text(text = "$myValue")
    }
}

@Composable
fun TextF() {
    var name by remember {
        mutableStateOf("")
    }
    TextField(value = name,
        modifier = Modifier
            .height(50.dp)
            .width(200.dp),
        onValueChange = { name = it },
        label = { Text(text = "Eslam") }
    )
}

