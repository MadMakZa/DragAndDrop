package com.makza.draganddrop

import androidx.annotation.DrawableRes

data class FoodItem(
    val id: Int,
    val name: String,
    val price: Double,
    @DrawableRes val image: Int
)

data class Person(
    val id: Int,
    val name: String,
    @DrawableRes val profile: Int
)

val foodList = listOf(
    FoodItem(1, "Pizza", 20.0, R.drawable.ic_launcher_background),
    FoodItem(2, "French toast", 20.0, R.drawable.ic_launcher_background),
    FoodItem(3, "Pelemeni", 20.0, R.drawable.ic_launcher_background)
)

val persons = listOf(
    Person(1, "User 1", R.drawable.ic_launcher_foreground),
    Person(2, "User 2", R.drawable.ic_launcher_foreground),
    Person(3, "User 3", R.drawable.ic_launcher_foreground)
)
