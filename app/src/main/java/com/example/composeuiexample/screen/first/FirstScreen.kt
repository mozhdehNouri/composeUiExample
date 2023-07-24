package com.example.composeuiexample.screen.first

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun FirstScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val feedList = remember {
        mutableStateListOf<Feed>()
    }.let {
        feeds
    }
    Column(modifier.fillMaxSize()) {
        LazyRow{
            items(feedList) {items ->
                FeedListItem(feed=items, onItemClick = {name->
                    Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
                })
            }


        }


    }

}