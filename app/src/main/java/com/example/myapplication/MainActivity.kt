package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Haykal Dani Muhammad",
                        nim = "225150607111031",
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize() // Make the Column fill the available space
                            .wrapContentSize(Alignment.Center) // Center the content inside the Column
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, nim: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally // Center the content horizontally
    ) {
        Text(
            text = "$name!",
            modifier = Modifier.padding(bottom = 8.dp) // Optional padding between text elements
        )
        Text(
            text = "$nim"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting(
            name = "Haykal Dani Muhammad",
            nim = "225150607111031",
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center) // Center the content in the preview
        )
    }
}
