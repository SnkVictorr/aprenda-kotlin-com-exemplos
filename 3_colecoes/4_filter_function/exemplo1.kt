/**
 * Função [filter].
 *
 * @see [filter](https://play.kotlinlang.org/byExample/05_Collections/04_filter)
 */
fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1
    
    val positives = numbers.filter { x -> x > 0 }  // 2 verifica se os numeros são positivos
    
    val negatives = numbers.filter { it < 0 }      // 3 verifica se os numeros são negativos

    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")
}
