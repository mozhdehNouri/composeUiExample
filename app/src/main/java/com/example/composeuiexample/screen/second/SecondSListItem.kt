package com.example.composeuiexample.screen.second

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Timer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeuiexample.ui.theme.ComposeUiExampleTheme
import com.example.composeuiexample.ui.theme.GreenGray80
import kotlin.random.Random
import com.example.composeuiexample.R as ComposeUiSample

@Composable
fun SecondSListItem(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(width = 1.dp, color = GreenGray80)
    ) {
        Column {
            Row(
                modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = ComposeUiSample.drawable.placeholder),
                    contentDescription = "",
                    modifier = modifier
                        .weight(1f)
                        .padding(5.dp)
                        .clip(
                            RoundedCornerShape(10.dp)
                        )
                )
                Column(
                    modifier = modifier
                        .padding(10.dp)
                        .weight(3f)
                ) {
                    CustomText()
                    CustomText()
                    CustomText()
                }
            }

            Row() {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = ""
                    )
                }

                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.AddBox,
                        contentDescription = ""
                    )
                }
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.Timer,
                        contentDescription = ""
                    )
                }


            }
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun CustomText(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxWidth()) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Spacer(
                modifier = modifier
                    .width(3.dp)
                    .height(20.dp)
                    .background(
                        Color.random()
                    )
            )
            Text(
                text = "Florida",
                style = MaterialTheme.typography.subtitle1,
                modifier = modifier.padding(start = 5.dp)
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(
                modifier = modifier
                    .clip(CircleShape)
                    .size(3.dp)
                    .background(
                        Color.random()
                    )
            )
            Text(
                text = "Going on Friday",
                style = MaterialTheme.typography.caption,
                modifier = modifier.padding(start = 5.dp)
            )
        }


    }

}


@Preview(showBackground = true)
@Composable
fun SecondSListItemPreview() {
    ComposeUiExampleTheme {
        SecondSListItem()
    }


}

fun Color.Companion.random(): Color {
    val red = Random.nextInt(256)
    val green = Random.nextInt(256)
    val blue = Random.nextInt(256)
    return Color(red, green, blue)
}




