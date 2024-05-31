package function
import kotlin.math.PI

	/*
	Reescreva a função CircleArea do exercício anterior como uma função de expressão única.
	*/

fun main() {
    println(areaCircle(2))
}
fun areaCircle(radius: Int): Double = PI * radius * radius


