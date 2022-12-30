/**
 * Funções de Escopo: [let].
 *
 * @see [let](https://play.kotlinlang.org/byExample/06_scope_functions/01_let)
 */
//let pode ser usado para escopo e para verificação de nulls
fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {

    val empty = "test".let {               // 1
        customPrint(it)                    // 2 it é "test"
        it.isEmpty()                       // 3 verifica se é vazio
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // 4 se str for nulo, let n será executado
            print("\t") //tabulação
            customPrint(it) //imprimindo em letra maiuscula
            println()
        }
    }
    
    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->       // 5 usando custom names e lets aninnhados
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }
    
    printNonNull(null)
    printNonNull("my string") 
    printIfBothNonNull("First","Second") 

}
