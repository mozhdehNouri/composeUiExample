package com.example.composeuiexample.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorScheme = darkColors(
    primary = Purple80,
    secondary = PurpleGrey80,

    )

private val LightColorScheme = lightColors(
    primary = Shadow11,
    onPrimary = White,
    secondary = GreenGray50,
    onSecondary = White,
    background = Black,
    surface = Shadow3,
    onBackground = Black,
    onSurface = GreenGray90

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun ComposeUiExampleTheme(
    darkTheme: Boolean = false,
    // Dynamic color is available on Android 12+
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme
    val sysUiController = rememberSystemUiController()
    SideEffect {
        sysUiController.setSystemBarsColor(
            color = colors.primary.copy(alpha = AlphaNearOpaque)
        )
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        content = content
    )
}