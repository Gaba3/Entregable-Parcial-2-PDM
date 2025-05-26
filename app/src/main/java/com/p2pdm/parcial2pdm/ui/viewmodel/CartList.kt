package com.p2pdm.parcial2pdm.ui.viewmodel

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.p2pdm.parcial2pdm.model.Product
import com.p2pdm.parcial2pdm.model.productCard
import com.p2pdm.parcial2pdm.model.productsList

@Composable
fun CartList(
    onProductCardClick: (Int) -> Unit
) {
    val cartList = productsList.filter { product ->
        product.addedToCart == true
    }
    if (cartList.isEmpty()) {
        Text(text = "No products in the cart")
    } else {
        LazyColumn (
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(cartList.size) { index ->
                productCard(
                    product = cartList[index],
                    onClickProductCard = onProductCardClick
                )
            }
        }
    }
}