package function
import kotlin.math.PI
	/*
	Você tem uma função que traduz um intervalo de tempo dado em horas, minutos e segundos em segundos.
 	Na maioria dos casos, você precisa passar apenas um ou dois parâmetros de função enquanto os demais são iguais a 0.
	Melhore a função e o código que a chama usando valores de parâmetro padrão e argumentos nomeados para que o
	código seja mais fácil de ler.
 
fun intervalInSeconds(hours: Int, minutes: Int, seconds: Int) =
    ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(0, 1, 25))
    println(intervalInSeconds(2, 0, 0))
    println(intervalInSeconds(0, 10, 0))
    println(intervalInSeconds(1, 0, 1))
}
	*/
fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))
}


fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds


