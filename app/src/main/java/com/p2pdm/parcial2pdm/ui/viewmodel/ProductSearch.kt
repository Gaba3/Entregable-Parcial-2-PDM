package com.p2pdm.parcial2pdm.ui.viewmodel

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.p2pdm.parcial2pdm.model.Product
import com.p2pdm.parcial2pdm.model.productCard
import kotlin.collections.filter

@Composable
fun ProductSearch(
    onProductCardClick: (Int) -> Unit,
    productList: List<Product>,
    searchQuery: String
){
    val searchResult = productList.filter { product ->
        product.name.contains(searchQuery, ignoreCase = true) ||
        product.description.contains(searchQuery, ignoreCase = true)
    }

    if( searchResult.isNotEmpty() ) {
        LazyColumn (
            modifier = Modifier
                .fillMaxSize()
        ){
            items(searchResult.size) { index ->
                productCard(
                    product = searchResult[index],
                    onClickProductCard = onProductCardClick
                )
            }
        }
    } else {
        Text(text = "No products found for query: $searchQuery")
    }
}