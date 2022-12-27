/**
 * Verificações de igualdade.
 *
 * @see [Equality Checks](https://play.kotlinlang.org/byExample/02_control_flow/04_Equality%20Checks)
 */
fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain") //setOf não aceitam elementos duplicados, diferente da lista e não ordenam valores
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1 // vai dar true pq possuem são estruturas identicas em termos de dados
    println(authors === writers)  // 2 // as referencias(endereços de memória) são false pq possui endereços  diferentes
 }
