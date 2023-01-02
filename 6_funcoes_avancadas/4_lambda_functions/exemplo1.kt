/**
 * Lambda Functions.
 *
 * @see [Lambda Functions](https://play.kotlinlang.org/byExample/04_functional/02_Lambdas)
 */

fun main() {

    // All examples create a function object that performs upper-casing.
    // So it's a function from String to String

    val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1 especificando internnamente e externamente

    val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2 n é necerrário definir o tipo externamente, pois ja é definindo internamente

    val upperCase3 = { str: String -> str.uppercase() }                     // 3 definindo só externamente

    // val upperCase4 = { str -> str.uppercase() }                          // 4 é necessário definir o tipo pelo menos internamente ou externamente, se não, Nào funcionara

    val upperCase5: (String) -> String = { it.uppercase() }                 // 5 it substitui apenas 1 parametro

    val upperCase6: (String) -> String = String::uppercase                  // 6 método que usa uma string, e a transforma em maiusculas

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))

}
