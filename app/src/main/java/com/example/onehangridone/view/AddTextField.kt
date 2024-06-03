package com.example.onehangridone.view

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@Composable
fun AppTextField(
    textValue: String,
    addText: (String) -> Unit
) {
    TextField(
        value = textValue,
        onValueChange = { addText(it) }
    )

}