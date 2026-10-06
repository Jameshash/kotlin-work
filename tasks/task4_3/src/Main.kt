// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val mark1 = args[0].toDouble()
    val mark2 = args[1].toDouble()
    val mark3 = args[2].toDouble()

    val Array = ((mark1 + mark2 + mark3) / 3).roundToInt()

    when(Array){
        in 70..100 -> println("Distinction")
        in 40 .. 69 -> println("Pass")
        in 0 .. 39 -> println("Fail")

    }
}