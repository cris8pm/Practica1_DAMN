package com.cpm.practica1.data

import androidx.compose.ui.graphics.vector.ImageVector

data class MenuItem(
    val title: String,
    val description: String,
    val icon: ImageVector,
    val destinationActivity: Class<*>
)