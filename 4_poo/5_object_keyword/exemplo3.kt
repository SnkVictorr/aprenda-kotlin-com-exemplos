/**
 * [object] Declaration.
 *
 * @see [Object Keyword](https://play.kotlinlang.org/byExample/03_special_classes/04_Object)
 */
//declarar uma classe como objeto
object DoAuth {                                                 //1 
    fun takeParams(username: String, password: String) {        //2 
        println("input Auth parameters = $username:$password")
    }
}

fun main(){
    DoAuth.takeParams("foo", "qwerty")                          //3
}
