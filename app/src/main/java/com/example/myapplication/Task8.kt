package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WaterTracker() {
    var waterCount by remember { mutableStateOf(0) }
    var combo by remember { mutableStateOf(0) }
    var bestCombo by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.padding(12.dp)
        ) {
            Text(
                text = "Best Combo $bestCombo days!",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        }
        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = "Water Tracker",
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
        }
        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = "$waterCount ml  ",
                fontSize = 38.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold
            )
        }
        Row(
            modifier = Modifier.padding(12.dp)
        ) {
            Button(
                onClick = { waterCount += 250 },
                modifier = Modifier.width(100.dp)
                    .height(40.dp)
            ) {
                Text(
                    text = "+250ml"
                )
            }
            Spacer(Modifier.width(8.dp))
            Button(
                onClick = { waterCount += 350 },
                modifier = Modifier.width(100.dp)
                    .height(40.dp)
            ) {
                Text(
                    text = "+350ml"
                )
            }
            Spacer(Modifier.width(8.dp))
            Button(
                onClick = { waterCount += 500 },
                modifier = Modifier.width(100.dp)
                    .height(40.dp)
            ) {
                Text(
                    text = "+500ml"
                )
            }
        }

        Row (
            modifier = Modifier.padding(8.dp)
        ) {
            Button(
                onClick = {
                    if (waterCount >= 1000) {
                        combo += 1
                    }
                    else {
                        combo = 0
                    }

                    if (combo > bestCombo) {
                        bestCombo = combo
                    }
                    waterCount = 0
                },
                modifier = Modifier.width(200.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(15.dp)
            ) {
                Text(
                    text = "Complete Day",
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Row(
            modifier = Modifier.padding(14.dp)
        ) {
            Text(
                text = "Current combo $combo days!",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun Task8Preview() {
    WaterTracker()
}