package com.example.onehangridone.components

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable



@Composable
fun AppTextFieldApp(
    textValue: String,
    addText: (String) -> Unit
) {
    TextField(
        value = textValue,
        onValueChange = { addText(it) }
    )

}
