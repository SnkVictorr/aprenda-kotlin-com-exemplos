/**
 * Passando funções como parâmetro.
 *
 * @see [Higher-Order Functions](https://play.kotlinlang.org/byExample/04_functional/01_Higher-Order%20Functions)
 */

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1 funções que recebem outras como parametros e tbm retorna outra funcao 
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3

fun main() {
    val sumResult = calculate(4, 5, ::sum)                          // 4  // passando x e y e a função sum que virará o argumento operation
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5 // passando x e y, e passando uma funcao de forma difrente
    println("sumResult $sumResult, mulResult $mulResult")
}
