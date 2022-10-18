package com.example.android.cookbookapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun RecipeList(recipes: List<Recipe>) {
    LazyColumn {
        items(recipes){
            RecipeCard(recipe = it)
        }
    }
}