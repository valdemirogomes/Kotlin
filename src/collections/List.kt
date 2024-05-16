import kotlin.collections.listOf

/*
 1 - Construa duas listas, sendo uma imutavel e a outra mutavel
 2 - Construa uma lista e defina o seu tipo
*/ 

fun main(){
	val personList = listOf("Maria","Francisca","Julia")
	println(personList[0])
	
	val peopleList = mutableListOf("José", "Alfredo", "Augusto")
	peopleList.add("Pedro")
	
	val tipeList : MutableList <String> = mutableListOf()
	
	
}