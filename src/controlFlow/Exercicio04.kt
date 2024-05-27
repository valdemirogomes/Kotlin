package controlFlow

import kotlin.collections.listOf
/*
Agora que sabemos como utilizar uma lista, declare uma lista de pessoas
e usando o laço for, intere sob ela e imprima os dados.
*/
fun main(){
	val list = listOf("Tião","José","Arlindo","Aroldo","Josefa")
	
	for(data in list){
		println(data)
	}
}

