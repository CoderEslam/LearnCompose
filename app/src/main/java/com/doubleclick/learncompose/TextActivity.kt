package com.doubleclick.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doubleclick.learncompose.ui.theme.LearnComposeTheme

class TextActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnComposeTheme {
                text()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun text() {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text =
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Blue, fontSize = 50.sp)) {
                        append("E")
                    }
                    withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
                        append("S")
                    }
                    append("L")
                    append("A")
                    append("M \n")

                    append(stringResource(id = R.string.app_name))

                },
                fontStyle = FontStyle(1),
                modifier = Modifier.width(200.dp)
            )
        }
    }

}