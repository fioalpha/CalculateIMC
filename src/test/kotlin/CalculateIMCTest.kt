import org.junit.Test
import kotlin.test.assertEquals

class CalculateIMCTest {

    @Test
    fun `calculate test` () {
        assertEquals(calculateIMC(65F, 1.50F), 28.88F)
    }

    @Test
    fun `when the result less or equal 16 then return BAIXO PESO MUITO GRAVE` () {
        assertEquals(MORE_THEN_LOW_WEIGHT_GRAVE, diagnostic(15F))
    }

    @Test
    fun `when the result between 16 and 16,99 then return BAIXO PESO GRAVE` () {
        assertEquals(LOW_HEIGHT_GRAVE, diagnostic(16.20F))
    }

    @Test
    fun `when the result between 17 and 18,49 then return BAIXO PESO` () {
        assertEquals(LOW_HEIGHT, diagnostic(17.46F))
    }

    @Test
    fun `when the result between 18,50 and 24,99 then return PESO NORMAL` () {
        assertEquals(NORMAL_HEIGHT, diagnostic(21.52F))
    }

    @Test
    fun `when the result between 25 and 29,99 then return SOBREPESO` () {
        assertEquals(OVER_HEIGHT, diagnostic(26F))
    }

    @Test
    fun `when the result between 30 and 34,99 then return OBESIDADE GRAU I` () {
        assertEquals(OBESITY_LEVE_1_HEIGHT, diagnostic(33F))
    }

    @Test
    fun `when the result between 35 and 39,99 then return OBESIDADE GRAU II` () {
        assertEquals(OBESITY_LEVE_2_HEIGHT, diagnostic(38F))
    }

    @Test
    fun `when the result more or equal 40 then return OBESIDADE GRAU III` () {
        assertEquals(OBESITY_LEVE_3_HEIGHT, diagnostic(43F))
    }


}