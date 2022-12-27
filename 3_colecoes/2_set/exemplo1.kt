/**
 * Conjuntos.
 *
 * @see [Set](https://play.kotlinlang.org/byExample/05_Collections/02_Set)
 */
//setOf() cria um conjunto imutavel e mutableSetOf() Cria um conjunto mutavel. Um modo só leitura oider usa utilizando Set
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1 Conjuntos são ordenados e n permitem duplicatas
//MutableSet<String> n é obrigatorio, mas é usado pra determinar o tipo
fun addIssue(uniqueDesc: String): Boolean {                                                       
    return openIssues.add(uniqueDesc)                                                             // 2
}

fun getStatusLog(isAdded: Boolean): String {                                                       
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // 3
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2" 

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // 4
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // 5 
}
