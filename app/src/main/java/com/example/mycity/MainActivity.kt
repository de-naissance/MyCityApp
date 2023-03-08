package com.example.mycity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.example.mycity.ui.MyCityApp
import com.example.mycity.ui.MyCityViewModel
import com.example.mycity.ui.theme.MyCityTheme

class MainActivity : ComponentActivity() {

    private val viewModel: MyCityViewModel by viewModels()

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyCityTheme {
                val windowSize = calculateWindowSizeClass(activity = this)
                //val uiState by viewModel.uiState.collectAsStateWithLifecycle()

                MyCityApp(
                   myCityViewModel = MyCityViewModel(),
                   windowSize = windowSize
                )
            }
        }
    }
}