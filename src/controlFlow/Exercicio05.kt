/*
 Usando uma expressão when, atualize o programa a seguir para que,
 quando você inserir os nomes dos botões do GameBoy,
 as ações sejam impressas na saída
 A - Yes
 B - No
 X - Menu
 Y - Nothing
 Other - There is no such button
 */

fun main(){
	val button = "A"
	when(button){
		"A" -> println("Yes")
		"B" -> println("No")
		"X" -> println("Menu")
		"Y" -> println("Nothing")
		"Other" -> println("There is no such button")
	}
	
}