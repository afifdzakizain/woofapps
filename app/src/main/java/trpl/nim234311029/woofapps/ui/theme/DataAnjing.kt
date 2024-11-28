package trpl.nim234311029.woofapps.ui.theme

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class DataAnjing(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    DataAnjing(R.drawable.ajg4, R.string.dog_name_1, 4, R.string.description_1),
    DataAnjing(R.drawable.ajg2, R.string.dog_name_2, 8, R.string.description_2),
    DataAnjing(R.drawable.ajg3, R.string.dog_name_3, 2, R.string.description_3),
    DataAnjing(R.drawable.ajg1, R.string.dog_name_4, 2, R.string.descripsi4),

    )