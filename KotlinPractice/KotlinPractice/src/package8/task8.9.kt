fun isPowerEqual(n: Int, k: Int): Boolean {
    val power = Math.pow(k.toDouble(), k.toDouble()).toInt()
    return power == n
}

fun main() {
    val n = 256
    val k = 4
    val result = isPowerEqual(n, k)

    println("Равно ли $k^$k = $n? $result")
}