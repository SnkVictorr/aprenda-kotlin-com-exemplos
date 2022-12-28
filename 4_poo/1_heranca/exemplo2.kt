/**
 * Herança com construtor parametrizado.
 *
 * @see [Inheritance](https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance)
 */

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}
//SiberianTiger é um Tiger Com origin = Siberia
class SiberianTiger : Tiger("Siberia")                  // 1

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}
