/**
 * Herança.
 *
 * @see [Inheritance](https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance)
 */
//toda classe padrão no kotlin é final
open class Dog {                // 1 Criando uuma classe pai, uma classe abertta
    open fun sayHello() {       // 2  Funcão aberta
        println("wow wow!")
    }
}
//forma de ler: Yorshire é um cachorro
class Yorkshire : Dog() {       // 3 a class Yorshire ta herdando as caracteristicas e comportamentos da classe Dog
    override fun sayHello() {   // 4 sobreescrevendo a função sayHello
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}
