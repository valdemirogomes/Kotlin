package function
import kotlin.math.PI
	/*
Escreva uma função chamada círculoArea que usa o raio de um círculo em formato inteiro como parâmetro
e gera a área desse círculo
	*/


fun main() {
    println(circleArea(2))
}
fun circleArea(radius: Int): Double {
    return PI * radius * radius
}
