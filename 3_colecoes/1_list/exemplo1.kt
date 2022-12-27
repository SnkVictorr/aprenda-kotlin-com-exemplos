/**
 * Listas.
 *
 * @see [List](https://play.kotlinlang.org/byExample/05_Collections/01_List)
 */
//Listas são estruturas de dados ordernadas, que pode ser mudada entre mutavel e imutavel 
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1 //listOf() cria uma lista imutavel mutableListOf() cria uma lista mutavel
val sudoers: List<Int> = systemUsers                              // 2 //Criando uma cópia de leitura da lista anterior

fun addSystemUser(newUser: Int) {                                 // 3
    systemUsers.add(newUser)                      
}

fun getSysSudoers(): List<Int> {                                  // 4
    return sudoers
}

fun main() {
    addSystemUser(4)                                              // 5 //adicionando um novo usuario no sistema
    println("Tot sudoers: ${getSysSudoers().size}")               // 6 //o resultado é 4, pois o systemUsers ta refletindo no sudoers
    getSysSudoers().forEach {                                     // 7
        i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!                           // 8
}
