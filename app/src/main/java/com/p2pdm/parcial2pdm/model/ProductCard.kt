package com.p2pdm.parcial2pdm.model

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun productCard(
    product: Product,
    onClickProductCard: (Int) -> Unit
) {
    Card (
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
    ){
        Row(
            modifier = Modifier
                .fillMaxSize()
                .clickable { onClickProductCard(product.id) }
                .padding(8.dp)
        ) {
            Image(
                painter = rememberAsyncImagePainter(product.image),
                contentDescription = product.name,
                modifier = Modifier.size(100.dp)
            )
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = "Name: ${product.name}")
                Text(text = "Category: ${product.category}")
                Text(text = "Price: ${product.price}")
            }
        }
    }
}