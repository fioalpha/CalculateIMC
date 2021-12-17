import org.junit.Test
import kotlin.test.assertEquals

class PizzaTest {

    @Test
    fun `Quando a pizza tiver 1 ingrediente` () {
        val pizza = Pizza()
        pizza.adicionarIngrediente("UM")
        assertEquals(15, pizza.getPreco())
    }

    @Test
    fun `Quando a pizza tiver 4 ingredientes` () {
        val pizza = Pizza()
        pizza.adicionarIngrediente("UM")
            .adicionarIngrediente("DOIS")
            .adicionarIngrediente("TRES")

        assertEquals(20, pizza.getPreco())
    }

    @Test
    fun `Quando a pizza tiver 6 ingredientes` () {
        val pizza = Pizza()
        pizza.adicionarIngrediente("UM")
            .adicionarIngrediente("DOIS")
            .adicionarIngrediente("TRES")
            .adicionarIngrediente("QUATRO")
            .adicionarIngrediente("CINCO")
            .adicionarIngrediente("SEIS")

        assertEquals(23, pizza.getPreco())
    }

}