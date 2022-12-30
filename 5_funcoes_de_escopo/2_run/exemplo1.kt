/**
 * Funções de Escopo: [run].
 *
 * @see [run](https://play.kotlinlang.org/byExample/06_scope_functions/02_run)
 */

fun main() {

    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {                                                  // 1 //run tbm verifica se a nulabilidade
            println("\tis empty? " + isEmpty())                    // 2
            println("\tlength = $length")                           
            length                                                 // 3 retorna length
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

}
