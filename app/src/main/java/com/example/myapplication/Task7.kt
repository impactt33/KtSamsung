package com.example.myapplication

import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.VectorComposable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun Task7(
    modifier: Modifier = Modifier,
    name: String = "",
    lastname: String = "",
    age: Int? = null,
    phoneNumber: String? = null
) {
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .padding(6.dp),
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(
            count = 4,
        ) {
            PrintInfo(
                name = name,
                lastname = lastname,
                age = age,
                phoneNumber = phoneNumber
                )
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
fun PrintInfo(
    modifier: Modifier = Modifier,
    name: String = "",
    lastname: String = "",
    age: Int? = null,
    phoneNumber: String? = null
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.background(Color.DarkGray)
                .sizeIn(220.dp, 120.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Name: $name \n" +
                        "Lastname: $lastname \n" +
                        "Age: $age \n" +
                        "Phone Number:\n$phoneNumber",
            )
        }
        Box(
            modifier = Modifier.background(Color.DarkGray)
                .sizeIn(120.dp, 120.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.circle),
                contentDescription = "Icon",
                contentScale = ContentScale.FillBounds
            )
        }
    }
}


