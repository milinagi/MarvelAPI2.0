package com.example.marvelapi20.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.marvelapi20.R
import com.example.marvelapi20.navigation.AppScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar() {
                Spacer(modifier = Modifier.width(30.dp))
                Text(text = "Marvel API")
            }
        }
    ) {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {
            navController.navigate(route = AppScreens.CharacterScreen.route)
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
        modifier = Modifier
            .size(200.dp, 100.dp)
            .padding(vertical = 10.dp)
            .border(
                BorderStroke(
                    width = dimensionResource(id = R.dimen.list_item_img_stroke),
                    color = Color.Black
                )
            )){
            Text(text = "Personajes", color = Color.Black, fontSize = 30.sp)
        }
        Button(onClick = {
            navController.navigate(route = AppScreens.ComicsScreen.route)
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
        modifier = Modifier
            .size(200.dp, 100.dp)
            .padding(vertical = 10.dp)
            .border(
                BorderStroke(
                    width = dimensionResource(id = R.dimen.list_item_img_stroke),
                    color = Color.Black
                )
            )
        ){
            Text(text = "Comics", color = Color.Black, fontSize = 30.sp)
        }
        Button(onClick = {
            navController.navigate(route = AppScreens.SeriesScreen.route)
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            modifier = Modifier
                .size(200.dp, 100.dp)
                .padding(vertical = 10.dp)
                .border(
                    BorderStroke(
                        width = dimensionResource(id = R.dimen.list_item_img_stroke),
                        color = Color.Black
                    )
                )){
            Text(text = "Series", color = Color.Black, fontSize = 30.sp)
        }




//        Button(onClick = {
//            navController.navigate(route = AppScreens.ComicsScreen.route)
//        }) {
//            Text(text = "Comics")
//        }
//
//
//        Button(onClick = {
//            navController.navigate(route = AppScreens.SeriesScreen.route)
//        }) {
//            Text(text = "Series")
//        }
    }
}