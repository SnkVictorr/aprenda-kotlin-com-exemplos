/**
 * Intervalos (ranges) de caracteres.
 *
 * @see [Ranges](https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges)
 */
fun main() {
    for(i in 0..3) {             // 1 vai de 0 até 3 inclusive
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2 vai de 0 até menor que 3 exclusive
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3 vai de 2 a 8 em 2 em 2
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 4 vai de 3 até 0
         print(i)
    }
    print(" ")

 }
