package com.example.marvelapi20.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.marvelapi20.components.ListAdvance
import com.example.marvelapi20.model.MarvelDatabase

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CharacterScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar() {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Personajes")
            }
        }
    ) {
        SecondBodyContent()
    }
}

@Composable
fun SecondBodyContent() {
    ListAdvance(MarvelDatabase.getAllHeroes())
}