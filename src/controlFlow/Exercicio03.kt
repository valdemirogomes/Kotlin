/*
 Usando a clausula when, desenvolva um
 algoritimo onde determina:
 1 - a partir de qual idade é obrigatório o voto
 2 - a partir de qual idade é opcional

 */

fun main(){
	val value : Int = 8
	
	val description = when {
		
		value >=16 && value <=17 && value >70 -> "Voto opcional"

		value >17 && value <=70 -> "Voto Obrigatório"
	
		else -> "Não vota"       
}
	println(description)
	
}