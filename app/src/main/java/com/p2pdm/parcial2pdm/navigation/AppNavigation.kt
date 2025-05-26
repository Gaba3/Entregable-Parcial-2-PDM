package com.p2pdm.parcial2pdm.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.p2pdm.parcial2pdm.model.Product
import com.p2pdm.parcial2pdm.model.productsList
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.p2pdm.parcial2pdm.navigation.CartScreen
import com.p2pdm.parcial2pdm.ui.view.CartScreen
import com.p2pdm.parcial2pdm.ui.view.HomeScreen
import com.p2pdm.parcial2pdm.ui.view.ProductDetailScreen

@Composable
fun AppNavigation(
    productList: List<Product> = productsList,
) {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
    ) {
        innerPadding ->
        NavHost(
            navController = navController,
            startDestination = HomeScreen.route,
            Modifier.padding(innerPadding)
        ) {
            composable(HomeScreen.route) {
                HomeScreen(
                    productList = productList,
                    onProductCardClick = { productId: Int ->
                        navController.navigate(ProductDetailScreen.createRoute(productId))
                    }
                )
            }
            composable(ProductDetailScreen.route + "/{productId}") {
                ProductDetailScreen(
                    productId = it.arguments?.getInt("productId") ?: -1,
                    navController
                )
            }
            composable (CartScreen.route){
                CartScreen(
                    onProductCardClick = { productId: Int ->
                        navController.navigate(ProductDetailScreen.createRoute(productId))
                    }
                )
            }
        }
    }
}