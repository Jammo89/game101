package com.example.onehangridone.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.onehangridone.navigation.CREATE_GAME

@Composable
fun StartScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Column {
            Text(text = "Добро пожаловать в игру", fontSize = 34.sp, fontWeight = FontWeight.Bold)
            Button(onClick = {navController.navigate(CREATE_GAME)}) {
                Text(text = "Начать")
            }
        }

    }


}