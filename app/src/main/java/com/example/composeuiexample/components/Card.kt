package com.example.composeuiexample.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun UiSampleCard(
    modifier: Modifier = Modifier,
    shape: Shape = MaterialTheme.shapes.medium,
    color: Color = MaterialTheme.colors.surface,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    border: BorderStroke? = null,
    elevation: Dp = 4.dp,
    content: @Composable () -> Unit
) {
    UiSampleSurface(
        modifier = modifier,
        shape = shape,
        color = color,
        contentColor = contentColor,
        elevation = elevation,
        border = border,
        content = content
    )
}