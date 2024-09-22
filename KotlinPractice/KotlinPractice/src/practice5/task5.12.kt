fun main() {
    // Запрашиваем у пользователя начальное число и шаг
    println("Введите начальное число:")
    val start = readLine()?.toIntOrNull() ?: return println("Некорректный ввод. Завершение программы.")

    println("Введите шаг:")
    val step = readLine()?.toIntOrNull() ?: return println("Некорректный ввод. Завершение программы.")

    for (a in start..start*10 step step) println(a)
}