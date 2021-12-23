import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {

    val pat = Patient()
    pat.weight = 19F
    pat.height = 1.50F

    println("${calculateIMC(pat.weight, pat.height)}")
}

fun calculateIMC(weight: Float,  height: Float): Float {
    val result = weight / (height * height)
    return result.toBigDecimal()
        .setScale(2, RoundingMode.DOWN)
        .toFloat()
}

fun diagnostic(imcCalculated: Float) : String {
    return when {
        imcCalculated < 16F -> MORE_THEN_LOW_WEIGHT_GRAVE
        imcCalculated > 16F && imcCalculated < 16.99F -> LOW_HEIGHT_GRAVE
        imcCalculated > 17F && imcCalculated < 18.49F -> LOW_HEIGHT
        imcCalculated > 18.50F && imcCalculated < 24.99F -> NORMAL_HEIGHT
        imcCalculated > 25F && imcCalculated < 29.99F -> OVER_HEIGHT
        imcCalculated > 30F && imcCalculated < 34.99F -> OBESITY_LEVE_1_HEIGHT
        imcCalculated > 35F && imcCalculated < 39.99F -> OBESITY_LEVE_2_HEIGHT
        else -> OBESITY_LEVE_3_HEIGHT
    }
}

const val MORE_THEN_LOW_WEIGHT_GRAVE = "Baixo peso muito grave"
const val LOW_HEIGHT_GRAVE = "Baixo peso grave"
const val LOW_HEIGHT = "Baixo peso"
const val NORMAL_HEIGHT = "Peso normal"
const val OVER_HEIGHT = "Sobrepeso"
const val OBESITY_LEVE_1_HEIGHT = "Obesidade grau I"
const val OBESITY_LEVE_2_HEIGHT = "Obesidade grau II"
const val OBESITY_LEVE_3_HEIGHT = "Obesidade grau III (obesidade mórbida)"



