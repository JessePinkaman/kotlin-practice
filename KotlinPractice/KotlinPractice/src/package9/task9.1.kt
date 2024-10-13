import kotlin.random.Random

fun main() {
    val randomNumbers = List(10) { Random.nextInt(1, 100) }

    println(randomNumbers)
}