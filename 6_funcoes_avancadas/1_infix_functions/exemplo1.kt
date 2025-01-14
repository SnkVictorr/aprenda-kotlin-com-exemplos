/**
 * Infix Functions.
 *
 * @see [Functions](https://play.kotlinlang.org/byExample/01_introduction/02_Functions)
 */

fun main() {

  infix fun Int.times(str: String) = str.repeat(this)        // 1
  println(2 times "Bye ")                                    // 2 a sa;ida vai ser Bye Bye

  val pair = "Ferrari" to "Katrina"                          // 3 cria um par
  println(pair)

  infix fun String.onto(other: String) = Pair(this, other)   // 4 tbm cria um par
  val myPair = "McLaren" onto "Lucas"
  println(myPair)

  val sophia = Person("Sophia")
  val claudia = Person("Claudia")
  sophia likes claudia                //claudia esta sendo adicionada                       // 5
}

class Person(val name: String) {
  val likedPeople = mutableListOf<Person>()
  infix fun likes(other: Person) { likedPeople.add(other) }  // 6 /adicionando pessoas
}
