/**
 * Retornando funções.
 *
 * @see [Higher-Order Functions](https://play.kotlinlang.org/byExample/04_functional/01_Higher-Order%20Functions)
 */

fun operation(): (Int) -> Int {                                     // 1
    return ::square //o retorno de uma função sendo uma execuçã ode uma outra
}

fun square(x: Int) = x * x     //recebe 2 como parametro e executa a multiplicacao                                     // 2

fun main() {
    val func = operation()                                          // 3
    println(func(2))               //passando 2 como parametro                                 // 4
}
