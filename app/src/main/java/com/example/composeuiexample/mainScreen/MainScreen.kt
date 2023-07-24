package com.example.composeuiexample.mainScreen

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeuiexample.components.UiSampleScaffold
import com.example.composeuiexample.components.UiSampleSurface
import com.example.composeuiexample.ui.theme.Shadow2

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
) {
    val listItem = remember() {
        mutableStateListOf<FirstSItemModel>()
    }.let {
        uiSampleItemList
    }
    UiSampleScaffold(backgroundColor = MaterialTheme.colors.background) { padding ->
        LazyColumn(modifier = modifier.padding(padding)) {
            items(listItem) { items ->
                ListItem(item = items)
            }
        }
    }

}

@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    item: FirstSItemModel,
) {
    UiSampleSurface(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = CircleShape,
        border = BorderStroke(1.dp, color = Shadow2)
    ) {
        Text(text = item.name, modifier.padding(20.dp))
    }

}


@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
//@Preview(showBackground = true, fontScale = 2f)
@Composable
fun FirstScreenPreview() {
    MainScreen()
}