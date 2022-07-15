package com.example.recipes.data

import com.example.recipes.R
import com.example.recipes.model.Recipe

class Datasource {

    fun loadRecipes(): List<Recipe> {
        return listOf<Recipe> (
        Recipe(R.string.muffin, R.drawable.icon_muffin),
        Recipe(R.string.pizza, R.drawable.icon_pizza),
        Recipe(R.string.gumiSuti, R.drawable.icon_gumisuti)
        )
    }
}