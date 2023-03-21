package com.doubleclick.learncompose.LazyColumn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doubleclick.learncompose.ui.theme.LearnComposeTheme

class LazyActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnComposeTheme {
                val personRepository = PersonRepository();
                val getAllData = PersonRepository().getAllData();
                LazyList(getAllData)
            }
        }
    }
}

//@Preview(showBackground = true)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyList(list: List<Person>) {
    Column(modifier = Modifier.fillMaxSize()) {
        LazyRow(
            contentPadding = PaddingValues(all = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            itemsIndexed(
                items = list,
                key = { i, p -> p.id }) { i, person ->
                Log.e("itemsIndexed", "onCreate: $i")
                CustomItem(person = person)
            }
        }
        LazyColumn(
            contentPadding = PaddingValues(all = 12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            itemsIndexed(items = list) { i, person ->
                Log.e("itemsIndexed", "onCreate: $i")
                CustomItem(person = person)
            }
            list.forEach { p ->
                stickyHeader {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray)
                            .padding(12.dp), text = "Section ${p.id}"
                    )
                }
                items(10) {
                    Text(
                        modifier = Modifier
                            .padding(12.dp), text = " Item $it from Section ${p.firstName}"
                    )
                }
            }
        }

        LazyRow(
            contentPadding = PaddingValues(all = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            list.forEach { p ->
                stickyHeader {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray)
                            .padding(12.dp), text = "Section ${p.id}"
                    )
                }
                items(10) {
                    Text(
                        modifier = Modifier
                            .padding(12.dp), text = " Item $it from Section ${p.firstName}"
                    )
                }
            }
        }
    }
}

