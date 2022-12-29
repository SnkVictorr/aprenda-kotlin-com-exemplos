/**
 * Passando argumentos do construtor para a superclasse.
 *
 * @see [Inheritance](https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance)
 */

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India") // 1 classe herda o Rufo como nome, e herda a origin como ïndia

fun main() {
    val lion: Lion = Asiatic("Rufo")  //  PAssando Rufo para a open class                          // 2
    lion.sayHello()
}
