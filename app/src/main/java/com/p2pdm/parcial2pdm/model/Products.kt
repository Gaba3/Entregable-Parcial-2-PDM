package com.p2pdm.parcial2pdm.model

data class Product(
    val id: Int,
    val name: String,
    val category: String,
    val price: Double,
    val description: String,
    val image: String,
    var addedToCart: Boolean = false
)

val productsList = listOf(
    Product(
        id = 1,
        name = "Laptop Lenovo ThinkPad",
        category = "Electrónica",
        price = 15499.99,
        description = "Laptop potente con procesador Intel i7, 16GB RAM y SSD de 512GB.",
        image = "https://example.com/images/laptop.jpg"
    ),
    Product(
        id = 2,
        name = "Auriculares Sony WH-1000XM4",
        category = "Audio",
        price = 5999.00,
        description = "Auriculares inalámbricos con cancelación de ruido líder en la industria.",
        image = "https://example.com/images/auriculares.jpg"
    ),
    Product(
        id = 3,
        name = "Silla Gamer Razer",
        category = "Muebles",
        price = 3499.50,
        description = "Silla ergonómica para largas horas de juego con soporte lumbar.",
        image = "https://example.com/images/silla.jpg"
    ),
    Product(
        id = 4,
        name = "Cámara Canon EOS M50",
        category = "Fotografía",
        price = 11499.00,
        description = "Cámara mirrorless con grabación 4K y lente intercambiable.",
        image = "https://example.com/images/camara.jpg"
    ),
    Product(
        id = 5,
        name = "Cafetera Nespresso",
        category = "Electrodomésticos",
        price = 1999.90,
        description = "Cafetera compacta de cápsulas con diseño elegante y moderno.",
        image = "https://example.com/images/cafetera.jpg"
    )
)
