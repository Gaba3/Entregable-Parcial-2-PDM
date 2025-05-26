package com.p2pdm.parcial2pdm.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.p2pdm.parcial2pdm.model.Product
import com.p2pdm.parcial2pdm.model.productCard
import com.p2pdm.parcial2pdm.navigation.HomeScreen
import com.p2pdm.parcial2pdm.ui.viewmodel.ProductSearch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen (
    onProductCardClick: (Int) -> Unit,
    productList: List<Product>,
) {
    var query by remember { mutableStateOf("") }
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text(text = "Catalogo de productos") }
            )
        }
    ){
        innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ){
            TextField(
                value = query,
                onValueChange = { query = it },
                label = { Text(text = "Buscar") }
            )

            if (query.isNotEmpty()) {
                ProductSearch(
                    searchQuery = query,
                    productList = productList,
                    onProductCardClick = onProductCardClick
                )
            } else {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    items(productList.size) { index ->
                        productCard(
                            product = productList[index],
                            onClickProductCard = onProductCardClick
                        )
                    }
                }
            }
        }
    }
}
