/**
 * Extension Function [nullSafeToString].
 *
 * @see [Extension Functions and Properties](https://play.kotlinlang.org/byExample/04_functional/03_extensionFunctions)
 */
//recebendo T. Se this não for nulo ele vai fazer o toString, se não ele vai imprimeir "Ausencia de valor"
fun <T> T?.nullSafeToString() = this?.toString() ?: "Ausencia de valor"  // 1

fun main() {
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}
