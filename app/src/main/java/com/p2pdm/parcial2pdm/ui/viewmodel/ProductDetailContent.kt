package com.p2pdm.parcial2pdm.ui.viewmodel

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.p2pdm.parcial2pdm.model.Product

@Composable
fun ProductDetailContent(
    product: Product,
    modifier: Modifier = Modifier
) {
    Column {
        Image(
            painter = rememberAsyncImagePainter(product.image),
            contentDescription = "Imagen de ${product.name}",
            modifier = modifier.size(300.dp)
        )
        Text(text = "Name: ${product.name}", modifier = modifier)
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = "Category: ${product.category}, modifier = modifier")
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = "Price: ${product.price}", modifier = modifier)
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = "Description: ${product.description}", modifier  = modifier)
    }
}