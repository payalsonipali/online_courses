package com.payal.onlinecoursesjetpack.model

data class FeaturedSubject(
    val image: Int,
    val title: String,
    val subTitle: String,
    val timeStamp: String,
    val progress: Float = 50f
)