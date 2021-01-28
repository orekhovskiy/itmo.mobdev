package ru.ifmo.mobdev.lab2_orekhovskiy

import androidx.annotation.DrawableRes

data class Android (
    val title: String,
    @DrawableRes val imageAndroid: Int,
    @DrawableRes val poster: Int,
    val description: String,
    val releaseDate: String,
    val versionTrailerUrl: String
)