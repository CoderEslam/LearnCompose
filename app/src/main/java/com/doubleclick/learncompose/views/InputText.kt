package com.doubleclick.learncompose.views

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun inputText(t: String, enabled: Boolean = false, readOnly: Boolean = false, context: Context?) {
    var text by remember {
        mutableStateOf("$t")
    }
    Column {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = text, onValueChange = { text = it },
            enabled = enabled,
            readOnly = readOnly,
            label = {
                Text(text = "Title")
            },
            singleLine = true /* you will write in single line*/,
            maxLines = 5 /* max line we can write */,
            leadingIcon = {
                IconButton(onClick = {
                    Toast.makeText(context, "leadingIcon", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(imageVector = Icons.Default.Email, contentDescription = "Email Icon")
                }
            },
            trailingIcon = {
                IconButton(onClick = {
                    Toast.makeText(context, "trailingIcon", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(imageVector = Icons.Default.Check, contentDescription = "Email Icon")
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search /* Send,Search ,Done , Go*/
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    Toast.makeText(context, "on Search ... ", Toast.LENGTH_SHORT).show()
                }
            )
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = text, onValueChange = { text = it },
            enabled = enabled,
            readOnly = readOnly,
            label = {
                Text(text = "Title")
            },
            singleLine = true /* you will write in single line*/,
            maxLines = 5 /* max line we can write */,
            leadingIcon = {
                IconButton(onClick = {
                    Toast.makeText(context, "leadingIcon", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(imageVector = Icons.Default.Email, contentDescription = "Email Icon")
                }
            },
            trailingIcon = {
                IconButton(onClick = {
                    Toast.makeText(context, "trailingIcon", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(imageVector = Icons.Default.Check, contentDescription = "Email Icon")
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search /* Send,Search ,Done , Go*/
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    Toast.makeText(context, "on Search ... ", Toast.LENGTH_SHORT).show()
                }
            )
        )
        BasicTextField(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .padding(16.dp),
            value = text, onValueChange = { text = it },
            enabled = enabled,
            readOnly = readOnly,
            /*label = {
                Text(text = "Title")
            },*/
            singleLine = true /* you will write in single line*/,
            maxLines = 5 /* max line we can write */,
            /*leadingIcon = {
                IconButton(onClick = {
                    Toast.makeText(context, "leadingIcon", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(imageVector = Icons.Default.Email, contentDescription = "Email Icon")
                }
            },
            trailingIcon = {
                IconButton(onClick = {
                    Toast.makeText(context, "trailingIcon", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(imageVector = Icons.Default.Check, contentDescription = "Email Icon")
                }
            },*/
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search /* Send,Search ,Done , Go*/
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    Toast.makeText(context, "on Search ... ", Toast.LENGTH_SHORT).show()
                }
            )
        )
    }
}


@Composable
@Preview(showBackground = true)
fun previewText() {
    inputText("Type here...", enabled = true, context = null)
}



