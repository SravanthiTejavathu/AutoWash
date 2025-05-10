package com.sravanthi.autowash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sravanthi.autowash.ui.theme.AutoWashAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AutoWashAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AutoWashHomeScreen()
                }
            }
        }
    }
}

@Composable
fun AutoWashHomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Welcome to AutoWash!",
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {
            // TODO: Add booking logic here
        }) {
            Text("Book a Wash")
        }
    }
}
