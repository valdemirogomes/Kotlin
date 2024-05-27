package controlFlow
	/*
Escreva um programa que simule o jogo Fizz buzz. Sua tarefa é imprimir números de 1 a 100 de forma incremental,
substituindo qualquer número divisível por três pela palavra "fizz" e
qualquer número divisível por cinco pela palavra "buzz".
Qualquer número divisível por 3 e 5 deve ser substituído pela palavra “fizzbuzz”.
	*/
fun main(){
    for (number in 1..100){
        if(number % 3 == 0){
            println("fizz")
        }
        if(number % 5 == 0){
            println("buzz")
        }
        if( number % 15 == 0){
             println("fizzbuzz")
            
        }else{
            println(number)
        }
    }
}

