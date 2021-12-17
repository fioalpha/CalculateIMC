import org.junit.Assert
import org.junit.Test

class CarrinhoDeCompraTest {

    @Test(expected = ErrorAddPizza::class)
    fun `Adicionar pizza no carrinho sem ingrediente`() {
        val carrinhoDeCompra = CarrinhoDeCompra()
        carrinhoDeCompra.addPizza(Pizza())
        Assert.assertEquals(0, carrinhoDeCompra.quantidadeItem())
    }

    @Test
    fun `Adicionar pizza no carrinho com um ingrediente`() {
        val carrinhoDeCompra = CarrinhoDeCompra()
        carrinhoDeCompra.addPizza(Pizza().adicionarIngrediente("UM"))
        Assert.assertEquals(1, carrinhoDeCompra.quantidadeItem())
    }

    @Test
    fun `Calcular valor do carrinho` () {
        val carrinhoDeCompra = CarrinhoDeCompra()
        carrinhoDeCompra.addPizza(Pizza().adicionarIngrediente("UM"))
        carrinhoDeCompra.addPizza(Pizza().adicionarIngrediente("UM"))
        Assert.assertEquals(2, carrinhoDeCompra.quantidadeItem())
        Assert.assertEquals(30, carrinhoDeCompra.contabilizarCarrinho())
    }

    @Test
    fun `Calcular valor do carrinho uma pizza` () {
        val carrinhoDeCompra = CarrinhoDeCompra()
        carrinhoDeCompra.addPizza(Pizza().adicionarIngrediente("UM"))
        Assert.assertEquals(1, carrinhoDeCompra.quantidadeItem())
        Assert.assertEquals(15, carrinhoDeCompra.contabilizarCarrinho())
    }
}