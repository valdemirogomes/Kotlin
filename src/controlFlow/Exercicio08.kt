package controlFlow
	/*
Escreva um programa que simule o jogo Fizz buzz. Sua tarefa é imprimir números de 1 a 100 de forma incremental,
substituindo qualquer número divisível por três pela palavra "fizz" e
qualquer número divisível por cinco pela palavra "buzz".
Qualquer número divisível por 3 e 5 deve ser substituído pela palavra “fizzbuzz”.
	*/
fun main() {
    var number : Int = 0
    
    while (number < 100) {
        number++
     var result = when{
             number % 5 == 0 -> "buzz"
             number % 3 == 0 -> "fizz"
             number % 15 == 0 -> "fizzbuzz"
             else -> number     
        }
		
     println(result)

        }   
    }
