fun repeatString(txt: String, n: Int): String {

    if (n <= 0) return ""
    return txt + repeatString(txt, n - 1)
}

fun main() {
    val txt = "beach "
    val n = 3
    val result = repeatString(txt, n)

    println("Результат: $result")
}