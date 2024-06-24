package com.example.onehangridone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.onehangridone.screens.CreateGame
import com.example.onehangridone.screens.StartScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = START_SCREEN) {
        composable(START_SCREEN) { StartScreen(navController = navController) }
        composable(route = CREATE_GAME) { CreateGame() }
    }
}


