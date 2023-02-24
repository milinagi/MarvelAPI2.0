package com.example.marvelapi20.components

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextOverflow
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.marvelapi20.R
import com.example.marvelapi20.model.Film

@Composable
fun ListAdvance(films: List<Film>) {
    val context = LocalContext.current
    LazyVerticalGrid(columns = GridCells.Fixed(2),
        content = {
            items(films.size) {
                val film = films[it]
                ItemListAdvance(film = film, modifier = Modifier.clickable {
                    Toast.makeText(context, films[it].name, Toast.LENGTH_SHORT).show()
                })
            }
        })
}


@OptIn(ExperimentalMaterialApi::class, ExperimentalGlideComposeApi::class)
@Composable
fun ItemListAdvance(film: Film, modifier: Modifier) {
    Column(modifier = modifier) {
        ListItem(
            text = { Text(text = film.name,
                style = MaterialTheme.typography.h6,
                maxLines = 2, overflow = TextOverflow.Ellipsis) },
            secondaryText = { Text(text = film.description,
                style = MaterialTheme.typography.subtitle2,
                maxLines = 3, overflow = TextOverflow.Ellipsis) },
            singleLineSecondaryText = false,
            icon = {
                GlideImage(model = film.photoUrl, contentDescription = "Cover film",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(dimensionResource(id = R.dimen.list_item_img_size))
                        .border(
                            BorderStroke(
                                width = dimensionResource(id = R.dimen.list_item_img_stroke),
                                color = Color.Black
                            )
                        ))
            },
        )
    }
}