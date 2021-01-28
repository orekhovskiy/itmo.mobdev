package ru.ifmo.mobdev.portfolioorekhovskiy

import androidx.annotation.DrawableRes

data class Element (
    val description: String,
    @DrawableRes val image: Int
)