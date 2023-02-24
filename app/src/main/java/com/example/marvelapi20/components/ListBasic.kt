package com.example.marvelapi20.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.marvelapi20.R
import com.example.marvelapi20.model.Film

@Composable
fun ListBasic(films: List<Film>) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        films.forEach {
            ItemListBasic(it.name)
//            ItemListBasic(it.description)
//            ItemListBasic(it.photoUrl)
        }
    }
}

@Composable
fun ItemListBasic(title: String) {
    Text(text = title, modifier = Modifier
        .fillMaxWidth()
        .padding(dimensionResource(id = R.dimen.common_padding_default)),
        style = MaterialTheme.typography.h6)
}