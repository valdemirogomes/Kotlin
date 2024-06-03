/*
 1 - Crie uma classe com os seguintes atributos e atribua o seu tipo
 nome
 sobrenome
 idade
 
 2 - Dentro do escopo da classe, crie uma função para determinar se o voto é obrigatorio, opcional, ou se não vota
 */

class Exercicio01 (val name: String, val surname: String, val age: Int){

	fun mandatoryVote(age:Int){
		if(age >=16 && age <=17 || age >70){
			println("Voto opcional para "+name)
		}else if(age >17 && age <=70 ){
			println("Voto Obrigatório para "+name)
		}else{
			println(name+" Não vota"  )
		}
		
	}

}
	fun main(){
		 val exercicio01 = Exercicio01("Maria","Aparecida",90)
		exercicio01.mandatoryVote(exercicio01.age)
	}