package com.p2pdm.parcial2pdm.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.p2pdm.parcial2pdm.model.productsList
import com.p2pdm.parcial2pdm.ui.viewmodel.ProductDetailContent

@Composable
fun ProductDetailScreen (
    productId: Int,
    navController: NavController
) {
    val selectedProduct = productsList.find {it.id == productId}
    if( selectedProduct == null) {
        return Text(text = "No product selected")
    } else {
        Scaffold{
                innerPadding ->
            Column {
                ProductDetailContent(
                    product = selectedProduct,
                    modifier = Modifier.padding(innerPadding)
                )
            }
            Row{
                Button(onClick = {navController.navigate("home_screen")}
                ) {
                    Text( text = "Home")
                }
                Button( onClick = {
                    selectedProduct.addedToCart = true
                }
                ) {
                    Text(text = "Add to Cart")
                }
            }
        }
    }
}
