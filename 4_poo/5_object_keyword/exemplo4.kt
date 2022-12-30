/**
 * Companion Objects.
 *
 * @see [Object Keyword](https://play.kotlinlang.org/byExample/03_special_classes/04_Object)
 */

class BigBen {                                  //1 
    companion object Bonger {                   //2 Bonger pode ser omitido
        fun getBongs(nTimes: Int) {             //3 pode ser acessado de uma maneira mais direta
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12)                         //4
}
