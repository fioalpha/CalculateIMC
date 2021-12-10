import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun calculateIMC(weight: Float,  height: Float): Float {
    val result = weight / (height * height)
    return result.toBigDecimal()
        .setScale(2, RoundingMode.DOWN)
        .toFloat()
}

fun diagnostic(imcCalculated: Float): String {
    return ""
}

const val MORE_THEN_LOW_WEIGHT_GRAVE = "Baixo peso muito grave"
const val LOW_HEIGHT_GRAVE = "Baixo peso grave"
const val LOW_HEIGHT = "Baixo peso"
const val NORMAL_HEIGHT = "Peso normal"
const val OVER_HEIGHT = "Sobrepeso"
const val OBESITY_LEVE_1_HEIGHT = "Obesidade grau I"
const val OBESITY_LEVE_2_HEIGHT = "Obesidade grau II"
const val OBESITY_LEVE_3_HEIGHT = "Obesidade grau III (obesidade mórbida)"



