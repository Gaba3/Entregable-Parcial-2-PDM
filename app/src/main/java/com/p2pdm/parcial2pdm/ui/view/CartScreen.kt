package com.p2pdm.parcial2pdm.ui.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.p2pdm.parcial2pdm.model.Product
import com.p2pdm.parcial2pdm.ui.viewmodel.CartList

@Composable
fun CartScreen(
    onProductCardClick: (Int) -> Unit) {
    CartList(
        onProductCardClick = onProductCardClick
    )
}