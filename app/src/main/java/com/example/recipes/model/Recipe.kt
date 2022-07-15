package com.example.recipes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recipe(
    @StringRes val stringResourcedId: Int,
    @DrawableRes val imageResourcedId: Int) {}