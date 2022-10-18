package com.example.android.cookbookapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RecipeCard(recipe: Recipe){
    Surface(
        shape = RoundedCornerShape(8.dp),
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column(Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = recipe.imageResource),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(144.dp)
            )
            Column(Modifier.padding(16.dp)) {
                Text(text = recipe.title,style = MaterialTheme.typography.h4)
                for (ingredient in recipe.ingredients) {
                    Text("• $ingredient")
                }
            }
        }
    }
}

@Composable
@Preview
fun RecipeCardPreview(){
    RecipeCard(recipe = defaultRecipes[0])
}