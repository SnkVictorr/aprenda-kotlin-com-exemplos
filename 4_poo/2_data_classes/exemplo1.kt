/**
 * Classes de Dados.
 *
 * @see [Data Classes](https://play.kotlinlang.org/byExample/03_special_classes/01_Data%20classes)
 */
//classe para marmazenar valores
data class User(val name: String, val id: Int) {           // 1
    override fun equals(other: Any?) =
        other is User && other.id == this.id               // 2 Nào gostaria de fazer a comparação de todas as propriedas do tipo user
}
fun main() {
    val user = User("Alex", 1)
    println(user)                                          // 3

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // 4
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())                               // 5 pega as propriedades que existem dentro da estrutura de dados e gera um valor
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())                                   // 6 copiando a estrutura pra outro endereço de memória
    println(user === user.copy())                          // 7
    println(user.copy("Max"))                              // 8 copiando novos paramentros
    println(user.copy(id = 3))                             // 9

    println("name = ${user.component1()}")                 // 10 imprimindo os componentes
    println("id = ${user.component2()}")
}
