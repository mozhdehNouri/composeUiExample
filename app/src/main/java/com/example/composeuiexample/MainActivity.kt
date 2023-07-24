package com.example.composeuiexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import com.example.composeuiexample.screen.first.FirstScreen
import com.example.composeuiexample.ui.theme.ComposeUiExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUiExampleTheme {
                // This app draws behind the system bars, so we want to handle fitting system windows
                WindowCompat.setDecorFitsSystemWindows(window, false)
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {


                    FirstScreen()

                }
            }
        }
    }
}


