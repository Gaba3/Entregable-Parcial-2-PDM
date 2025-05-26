package com.p2pdm.parcial2pdm.navigation

import kotlinx.serialization.Serializable

@Serializable
object HomeScreen {
    const val route = "home_screen"
}

@Serializable
object ProductDetailScreen {
    const val route = "product_detail_screen"
    fun createRoute(productId: Int): String {
        return "$route/$productId"
    }
}

@Serializable
object CartScreen {
    const val route = "cart_screen"
}