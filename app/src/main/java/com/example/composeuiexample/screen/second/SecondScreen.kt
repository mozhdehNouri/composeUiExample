package com.example.composeuiexample.screen.second

import android.content.res.Configuration.UI_MODE_TYPE_CAR
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.ArrowRight
import androidx.compose.material.icons.outlined.FileCopy
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeuiexample.components.UiSampleScaffold
import com.example.composeuiexample.utils.mirroringIcon

@Composable
fun SecondScreen(modifier: Modifier = Modifier) {
    UiSampleScaffold(
        topBar = {
            SecondScreenToolbar()
        }
    ) {
        ContentScreen()
    }


}

@Composable
fun ContentScreen(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Text(
            text = "Last week",
            modifier.weight(1f),
            textAlign = TextAlign.Start, color = Color.Gray
        )
        Text(
            text = "2 trips",
            modifier.weight(1f),
            textAlign = TextAlign.End,
            color = Color.Gray
        )
    }
    LazyColumn {
        items()
    }

}


@Composable
fun SecondScreenToolbar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { },
            modifier = modifier.weight(1f)
        ) {
            Icon(
                imageVector = mirroringIcon(
                    ltrIcon = Icons.Outlined.ArrowForward,
                    rtlIcon = Icons.Outlined.ArrowRight
                ),
                contentDescription = "",
                tint = Color.Gray
            )
        }
        Text(
            text = "Your Trips",
            modifier = modifier
                .weight(5f),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.LineThrough,
            style = MaterialTheme.typography.h6,
            color = Color.Gray
        )

        IconButton(
            onClick = { /*TODO*/ },
            modifier = modifier.weight(1f)
        ) {
            Icon(
                imageVector = Icons.Outlined.FileCopy,
                contentDescription = "",
                tint = Color.Gray
            )
        }

    }
}

@Preview(uiMode = UI_MODE_TYPE_CAR, showBackground = true)
@Composable
fun Preview() {
    SecondScreen()
}