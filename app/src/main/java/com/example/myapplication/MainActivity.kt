package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    {
                        TopAppBar(
                            title = { Text("Hello Android!") },
                            navigationIcon = { Icon(
                                imageVector = Icons.Default.AccountCircle,
                                contentDescription = "Icon"
                                ) },
                            colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color.DarkGray)
                        )
                    }
                ) { innerPadding ->
                    WaterTracker()
                }
            }
        }
    }
}

@Composable
fun Task6(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.background(Color.DarkGray)
                .height(120.dp)
                .width(240.dp),
            contentAlignment = Alignment.TopEnd
        ) {
            Image(
                modifier = Modifier
                    .clip(CircleShape)
                    .height(24.dp)
                    .width(24.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(R.drawable.circle),
                contentDescription = "SampleImage"

            )
        }

        Spacer(modifier = Modifier.height(50.dp))

        Box(
            modifier = Modifier.background(Color.Blue)
                .height(120.dp)
                .width(240.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier
                    .size(width = 240.dp, height = 120.dp)
                    .padding(2.dp),
                painter = painterResource(R.drawable.circle),
                contentDescription = "SampleImage",
                contentScale = ContentScale.FillBounds,
                colorFilter = ColorFilter.tint(Color(0xFF9C27B0))
            )
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun Task7Preview() {
    Task7(
        name = "Oleg",
        lastname = "Ruban",
        age = 14,
        phoneNumber = "88005553535"
    )
}

