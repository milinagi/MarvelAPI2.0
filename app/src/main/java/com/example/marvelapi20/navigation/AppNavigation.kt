package com.example.marvelapi20.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marvelapi20.screens.*

@Preview
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.route
    ) {
        composable(route = AppScreens.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(route = AppScreens.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(route = AppScreens.CharacterScreen.route) {
            CharacterScreen(navController = navController)
        }
        composable(route = AppScreens.ComicsScreen.route) {
            ComicsScreen(navController = navController)
        }
        composable(route = AppScreens.SeriesScreen.route) {
            SeriesScreen(navController = navController)
        }
    }
}
