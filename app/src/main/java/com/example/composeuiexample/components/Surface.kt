package com.example.composeuiexample.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun UiSampleSurface(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    color: Color = MaterialTheme.colors.surface,
    contentColor: Color = MaterialTheme.colors.primary,
    border: BorderStroke? = null,
    elevation: Dp = 0.dp,
    content: @Composable () -> Unit,
) {

        Box(
            modifier = modifier.shadow(elevation = elevation, shape = shape, clip = false)
                .zIndex(elevation.value)
                .then(if (border != null) Modifier.border(border, shape) else Modifier)
                .background(
                    color = MaterialTheme.colors.surface,
                    shape = shape
                )
                .clip(shape)
        ) {
            CompositionLocalProvider(LocalContentColor provides contentColor, content = content)
        }
}




