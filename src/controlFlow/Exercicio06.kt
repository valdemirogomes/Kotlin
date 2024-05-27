	/*
	Você tem um programa que conta fatias de pizza até formar uma pizza inteira com 8 fatias.
 	Refatore este programa de duas maneiras:
	Use um loop while.
	Use um loop do-while.
fun main() {
    var pizzaSlices = 0
    // Start refactoring here
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}
	*/
	fun main(){
		var pizzaSlices = 0
		
		while(pizzaSlices <8){
			pizzaSlices++
			println("There's only $pizzaSlices slice/s of pizza :(")

		}
		pizzaSlices++
		println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
	}