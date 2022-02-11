package com.metehanbolat.lazycolumnitempositionanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.lazycolumnitempositionanimation.ui.theme.LazyColumnItemPositionAnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnItemPositionAnimationTheme {
                
            }
        }
    }
}
