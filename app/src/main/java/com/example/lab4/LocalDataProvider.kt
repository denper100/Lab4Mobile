package com.example.lab4

import com.example.lab4.R

object LocalDataProvider {
    val categories: List<Category> = listOf(
        Category(1, R.string.cat_parks, R.drawable.cat_parks),
        Category(2, R.string.cat_museums, R.drawable.cat_museums),
        Category(3, R.string.cat_food, R.drawable.cat_food)
    )

    val places: List<Place> = listOf(

        Place(1, R.string.park_1_name, R.string.park_1_desc, R.drawable.park_1, 1),
        Place(2, R.string.park_2_name, R.string.park_2_desc, R.drawable.park_2, 1),
        Place(3, R.string.park_3_name, R.string.park_3_desc, R.drawable.park_3, 1),
        Place(4, R.string.park_4_name, R.string.park_4_desc, R.drawable.park_4, 1),


        Place(5, R.string.mus_1_name, R.string.mus_1_desc, R.drawable.mus_1, 2),
        Place(6, R.string.mus_2_name, R.string.mus_2_desc, R.drawable.mus_2, 2),
        Place(7, R.string.mus_3_name, R.string.mus_3_desc, R.drawable.mus_3, 2),
        Place(8, R.string.mus_4_name, R.string.mus_4_desc, R.drawable.mus_4, 2),


        Place(9, R.string.food_1_name, R.string.food_1_desc, R.drawable.food_1, 3),
        Place(10, R.string.food_2_name, R.string.food_2_desc, R.drawable.food_2, 3),
        Place(11, R.string.food_3_name, R.string.food_3_desc, R.drawable.food_3, 3),
        Place(12, R.string.food_4_name, R.string.food_4_desc, R.drawable.food_4, 3)
    )
}