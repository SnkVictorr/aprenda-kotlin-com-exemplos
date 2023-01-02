/**
 * Exemplo básico de uma [suspend] function com Coroutines.
 *
 * @see [Coroutines basics](https://kotlinlang.org/docs/coroutines-basics.html)
 */

import kotlinx.coroutines.*


fun main() = runBlocking { //runblocking é necessario para  que a coroutine funcione
    doWorld()
}
//executar elementos assincronos, (em tempos diferentes)
suspend fun doWorld() = coroutineScope {
    launch { //launch construtor de coroutine
        delay(1000L) // delay de 1 segundo
        println("World!")
    }
    print("Hello ")
}
