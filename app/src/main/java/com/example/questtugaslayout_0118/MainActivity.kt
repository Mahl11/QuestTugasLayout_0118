package com.example.questtugaslayout_0118

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.questtugaslayout_0118.ui.theme.QuestTugasLayout_0118Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestTugasLayout_0118Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    UtamaLayoutScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
