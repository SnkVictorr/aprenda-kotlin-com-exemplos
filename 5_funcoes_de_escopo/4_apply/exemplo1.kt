/**
 * Funções de Escopo: [apply].
 *
 * @see [apply](https://play.kotlinlang.org/byExample/06_scope_functions/04_apply)
 */

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "") //Person vai ser inicializado com esses parametros
}

fun main() {

    val jake = Person()                                     // 1
    val stringDescription = jake.apply {      //modificando a classe , atualizando valores            // 2
        name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }.toString() //podemos aplicar uma operação no final                                            // 4

    println(stringDescription)
}
