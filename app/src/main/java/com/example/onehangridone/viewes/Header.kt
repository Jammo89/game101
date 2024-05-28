package com.example.onehangridone.viewes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeaderApp(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color.DarkGray),
        // horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,

        ) {


        Text(
            text = "Игрок",
            fontSize = 26.sp,
            color = Color.White,
            fontWeight = FontWeight(800),
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center

        )

        Text(
            text = "Счет",
            fontSize = 26.sp,
            color = Color.White,
            fontWeight = FontWeight(800),
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center

        )


    }
}