/**
 * Funções [map] e [flatMap].
 *
 * @see [flatMap](https://play.kotlinlang.org/byExample/05_Collections/12_flatMap)
 */

fun main() {

    val fruitsBag = listOf("apple","orange","banana","grapes")  // 1
    val clothesBag = listOf("shirts","pants","jeans")           // 2
    val cart = listOf(fruitsBag, clothesBag)                    // 3
    val mapBag = cart.map { it }                                // 4 Mantem as estruturas das listas
    val flatMapBag = cart.flatMap { it }                        // 5 Junta todas as listas/elementos

    println("Your bags are: $mapBag") 
    println("The things you bought are: $flatMapBag")
}
