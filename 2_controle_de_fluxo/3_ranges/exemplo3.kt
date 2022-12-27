/**
 * Intervalos (ranges) pode ser utilizados em estruturas condicionais, como o [if].
 *
 * @see [Ranges](https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges)
 */
fun main() {
    val x = 2
    if (x in 1..5) {            // 1 ranges tbm poder ser usados em condições
        print("x is in range from 1 to 5") 
    }
    println()

    if (x !in 6..10) {          // 2
        print("x is not in range from 6 to 10")
    }
 }
