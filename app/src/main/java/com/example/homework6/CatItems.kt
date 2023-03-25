package com.example.homework6

import java.io.Serializable
import java.io.SerializablePermission

data class CatItems(
    val catImage: String? = null,
    val textName: String? = null,
    val detail: String? = null
): Serializable
