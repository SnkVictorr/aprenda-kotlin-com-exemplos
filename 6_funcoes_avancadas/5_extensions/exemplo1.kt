/**
 * Extension Functions e Extension Properties.
 *
 * @see [Extension Functions and Properties](https://play.kotlinlang.org/byExample/04_functional/03_extensionFunctions)
 */
//criando uma data class para adicionar dados
data class Item(val name: String, val price: Float)                                         // 1  
// criando uma classe como funcoes extendidas
data class Order(val items: Collection<Item>)  
//dentro da ordem que chamar, vai pegar os itens e fazer um filtro pelo preço. ?. retorna o preço float se tiver. ?: retorna 0 se não tiver
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2  
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"
///criando um atributo novo dentro da order
val Order.commaDelimitedItemNames: String            //variavel que lista todos os elementos                                       // 3
    get() = items.map { it.name }.joinToString()

fun main() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))
    //imprimindo o nome, o valor do item com maior preço e imprimindo a lista de itens
    println("Max priced item name: ${order.maxPricedItemName()}")                           // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                                      // 5

}
