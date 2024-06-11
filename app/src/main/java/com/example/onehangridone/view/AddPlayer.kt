package com.example.onehangridone.view

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun AddPlayer(
    text: String,
    addPlayer: () -> Unit
) {

    Button(
        onClick = {
            addPlayer()
        }, modifier = Modifier
            .height(64.dp)
            .width(150.dp)
    ) {
        Text(text = text, textAlign = TextAlign.Center)

    }
}
