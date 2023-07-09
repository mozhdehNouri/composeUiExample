package com.example.composeuiexample.screen.first

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeuiexample.components.UiSampleImage
import com.example.composeuiexample.ui.theme.Shadow7

@Composable
fun FeedListItem(
//    feed: FeedModel,
    onItemClick: (String) -> Unit,
    modifier: Modifier = Modifier,
    feed: Feed

) {
    Card(
        modifier = modifier.size(
            width = 200.dp,
            height = 250.dp
        ).padding(10.dp).clickable {
            onItemClick(feed.name)
        } ,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(modifier.fillMaxSize()) {
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .height(160.dp)
            ) {
                Box(
                    modifier = modifier
                        .height(100.dp)
                        .fillMaxWidth()
                        .background(Shadow7)
                )
                UiSampleImage(
                    imageUrl = feed.imageUrl,
                    modifier = modifier
                        .size(120.dp)
                        .align(Alignment.BottomCenter)
                        .clip(CircleShape),
                    contentDescription = ""
                )
            }
            Text(
                text = feed.name,
                modifier.padding(5.dp),
                style = MaterialTheme.typography.subtitle1,
            )

            Text(
                text = feed.tagline,
                modifier.padding(3.dp),
                style = MaterialTheme.typography.body1,
            )
        }
    }
}


//@Preview(
//    name = "darkMode",
//    showBackground = true,
//    uiMode = UI_MODE_NIGHT_YES
//)
//@Preview("large font", fontScale = 2f)
@Preview()
@Composable
fun FeedItemPreview() {
//    FeedListItem()
}