/**
 * Classes "Seladas".
 *
 * @see [Sealed Classes](https://play.kotlinlang.org/byExample/03_special_classes/03_Sealed%20Classes)
 */
//Cria restrição na classe á nivel de pacote
sealed class Mammal(val name: String)           ///mamifero                                        // 1
//elas estão na mesma estrutura de pacote
class Cat(val catName: String) : Mammal(catName)                                        // 2
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String { //função generica que usa mamiferos como tipo
    when (mammal) {                                                                     // 3
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
        is Cat -> return "Hello ${mammal.name}"                                         // 5     
    }                                                                                   // 6
}

fun main() {
    val cat: Mammal = Cat("Snowy") //inferencia de tipos 
    val human = Human("VVenilton, "Líder técnico na DIO")
                              
    println(greetMammal(cat))
    println(greetMammal(human))
}
