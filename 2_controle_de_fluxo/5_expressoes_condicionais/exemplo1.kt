/**
 * Expressões condicionais (análogas a operadores ternários).
 *
 * @see [Conditional Expression](https://play.kotlinlang.org/byExample/02_control_flow/05_Conditional%20expression)
 */
fun main() {
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1 expressão if que verifica se a é maior que b, e retorna a se for, e b se n for

    println(max(99, -42))
 }
