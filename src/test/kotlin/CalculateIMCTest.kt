import org.junit.Test
import kotlin.test.assertEquals

class CalculateIMCTest {

    @Test
    fun `calculate test` () {
        assertEquals(calculateIMC(65F, 1.50F), 28.88F)
    }

    @Test
    fun `when the result less or equal 16 Then return BAIXO PESO MUITO GRAVE` () {
        assertEquals(diagnostic(16F), MORE_THEN_LOW_WEIGHT_GRAVE)
    }

    @Test
    fun `LOW_HEIGHT_GRAVE` () {
        assertEquals(diagnostic(16F), LOW_HEIGHT_GRAVE)
    }

    @Test
    fun `LOW_HEIGHT` () {
        assertEquals(diagnostic(16F), LOW_HEIGHT)
    }

    @Test
    fun `NORMAL_HEIGHT` () {
        assertEquals(diagnostic(16F), NORMAL_HEIGHT)
    }

    @Test
    fun `OVER_HEIGHT` () {
        assertEquals(diagnostic(16F), OVER_HEIGHT)
    }
}