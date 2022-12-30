/**
 * Enum podem ter propriedades e métodos.
 *
 * @see [Enum Classes](https://play.kotlinlang.org/byExample/03_special_classes/02_Enum)
 */

enum class Color(val rgb: Int) {                      // 1
    RED(0xFF0000),                                    // 2
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3 função que serve pra ver se quem ta chamando esse metodo tem a cor vvermelha
}

fun main() {
    val red = Color.RED
    println(red)                                      // 4 RED
    println(red.containsRed())                        // 5 true
    println(Color.BLUE.containsRed())                 // 6 false
    println(Color.YELLOW.containsRed())               // 7 true
}
