package classInKotlin;

/*
  Defina uma classe de dados duas propriedades: 
  uma para nome e outra para salário. Certifique-se de que o a propriedade referente ao salário é mutável. Defina
  um valor padrão para salario. Intancie a classe Exercicio03, e implemente um aumento 
  de R$10 na variavel salario. A função main devera mostrar o comportamento da classe definidada.
  */

data class Exercicio03(val name: String ) {
    var salary: Int = 20

}

fun employee(){
	 val exercicio03 = Exercicio03("Mary")
     exercicio03.salary += 10
     
	print(exercicio03.name + " aumentou seu salário para R$ "+exercicio03.salary)
}

fun main(){
    employee()
}



