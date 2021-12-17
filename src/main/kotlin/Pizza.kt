/**

   -  Crie uma classe Pizza que possua o método adicionaIngrediente() que recebe uma String com o ingrediente a ser adicionado.
    Essa classe também deve possuir o método getPreco() que calcula da seguinte forma: 2 ingredientes ou menos custam 15 reais,
    de 3 a 5 ingredientes custam 20 reais e mais de 5 ingredientes custa 23 reais.

   - É preciso contabilizar os ingredientes gastos por todas as pizzas! Utilize uma variável estática na classe
    Pizza para guardar esse tipo de informação (dica: utilize a classe HashMap para guardar o ingrediente como chave
    e um Integer como valor). Crie o método estático contabilizaIngrediente() para ser chamado dentro de adicionaIngrediente()
    e fazer esse registro.

   - Crie uma nova classe chamada CarrinhoDeCompras que pode receber objetos da classe Pizza. Ela deve ter um método que retorna
    o valor total de todas as pizzas adicionadas. O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes.

   Crie uma classe Principal com o método main() que faz o seguinte:

   Cria 3 pizzas com ingredientes diferentes

   Adiciona essas Pizzas em um CarrinhoDeCompra

   Imprime o total do CarrinhoDeCompra

   Imprime a quantidade utilizada de cada ingrediente

   Entregue um código organizado e limpo!

*/


fun main() {

    val carrinhoDeCompra = CarrinhoDeCompra()

    val pizza1 = Pizza().adicionarIngrediente("UM")

    val pizza2 = Pizza().adicionarIngrediente("UM")
        .adicionarIngrediente("DOIS")

    val pizza3 = Pizza().adicionarIngrediente("UM")
        .adicionarIngrediente("DOIS")
        .adicionarIngrediente("TRES")

    val pizzaEmpty = Pizza()


    carrinhoDeCompra.addPizza(pizza1)
        .addPizza(pizza2)
        .addPizza(pizza3)

    println("Valor total R$ ${carrinhoDeCompra.contabilizarCarrinho()}")
}

/**
 * TODO
 * Melhorar logica de calculo
 */
class Pizza {

    private val ingredientesLista: MutableList<String> = mutableListOf()

    fun adicionarIngrediente(ingrediente: String) = apply {
        ingredientesLista.add(ingrediente)
    }

    fun getPreco(): Int {
        return when (ingredientesLista.count()) {
            in 1..2 -> 15
            in 3..5 -> 20
            else -> 23
        }
    }

    fun tenhoIngrediente() = ingredientesLista.isNotEmpty()

}

/***
 * TODO
 * Quantidade de ingrediente por pizza
 * Quantidade de ingrediente De todo o carrinho
 *
 */
class CarrinhoDeCompra {

    private val listaPizza = mutableListOf<Pizza>()

    fun addPizza(pizza: Pizza) = apply {
        if (!pizza.tenhoIngrediente()) throw ErrorAddPizza()
        listaPizza.add(pizza)
    }

    fun quantidadeItem() = listaPizza.count()

    fun contabilizarCarrinho() = listaPizza.fold(0) { accumulate: Int, pizza: Pizza ->
        pizza.getPreco() + accumulate
    }

    fun quantidadeIngrediente() = {}
}

class ErrorAddPizza: Exception("Não foi possivel adicionar piza sem ingrediente")