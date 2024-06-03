/*
 1 - Crie uma classe Product com os seguintes atributos e atribua o seu tipo
 nameProduct
 category
 quantity
 value
 2 - Crie uma intancia dessa classe
 */

fun main(){
	val product = Product("Café","Bebida",3, 5.50)
}

class Product(val nameProduct: String, val category: String, val quantity: Int, val value: Double) {
}