package com.doubleclick.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                        MyCompose()
                        customText("Eslam Ghazy")
                        customText("Eslam Ghazy")
                        customText("Eslam Ghazy")
                        customText("Eslam Ghazy")
                        MySurface()
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

//@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnComposeTheme {
//        Greeting("Android")
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

@Composable
fun customText(text: String) {
    Text(
        text = text,
        style = TextStyle(color = Color.Cyan, fontSize = 24.sp)
    )
}

@Preview(showBackground = true)
@Composable
fun MySurface() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Surface(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colors.primary
        ) {
        }
        customItem()
        Surface(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colors.primary
        ) {
        }
        Surface(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colors.primary
        ) {
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxSize()) {
            Surface(
                modifier = Modifier
                    .height(50.dp)
                    .weight(1f),
                color = MaterialTheme.colors.primary
            ) {
            }
            Spacer(modifier = Modifier.width(20.dp))
            Surface(
                modifier = Modifier
                    .height(50.dp)
                    .weight(1f),
                color = MaterialTheme.colors.primary
            ) {
            }
        }
    }
}

@Composable
fun ColumnScope.customItem() {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .weight(1f), color = MaterialTheme.colors.primary
    ) {

    }
}

