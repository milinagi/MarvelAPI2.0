package com.example.marvelapi20.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.marvelapi20.R
import com.example.marvelapi20.navigation.AppScreens
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavHostController) {
    
    LaunchedEffect(key1 = true) {
        delay(1000)
        navController.popBackStack()
        navController.navigate(AppScreens.MainScreen.route)
    }

    Splash()
}

@Composable
fun Splash() {
    Column(modifier = Modifier
        .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.img_marvel),
            contentDescription = "SplashScreen",
            modifier = Modifier.size(300.dp, 300.dp)
        )
        Text(text = "Powered by",
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold
        )
        Text(text = "Jorge Ruiz Cabrera")
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SplashScreenPreview() {
    Splash()
}
