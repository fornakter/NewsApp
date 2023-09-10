package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Pierwszy wpis",
        description = "Siema",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Drugi",
        description = "Siema 2",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Ostatni",
        description = "Siema siema madafaka",
        image = R.drawable.onboarding3
    )
)