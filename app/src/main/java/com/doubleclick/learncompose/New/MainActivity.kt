package com.doubleclick.learncompose.New

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.doubleclick.learncompose.ui.theme.LearnComposeTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LearnComposeTheme {
                val scaffoldState = rememberScaffoldState()
                var txt_fild_State by remember {
                    mutableStateOf("")
                }
                val scope = rememberCoroutineScope()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState = scaffoldState
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 30.dp)
                    ) {
                        TextField(
                            value = txt_fild_State, onValueChange = {
                                txt_fild_State = it
                            },
                            label = { Text(text = "Name") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(onClick = {
                            scope.launch {
                                scaffoldState.snackbarHostState.showSnackbar("$txt_fild_State")
                            }
                        }) {
                            Text(text = "Hello")
                        }
                    }
                }

            }
        }
    }
}