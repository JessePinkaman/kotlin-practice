fun main() {
    println("калькулятор")

    var firstNumber: Double
    var secondNumber: Double
    var operator: Char

    print("Введите первое число: ")
    firstNumber = readLine()!!.toDouble()

    print("Введите операцию (+, -, *, /): ")
    operator = readLine()!![0]

    print("Введите второе число: ")
    secondNumber = readLine()!!.toDouble()

    when (operator) {
        '+' -> println("Ответ: ${firstNumber + secondNumber}")
        '-' -> println("Ответ: ${firstNumber - secondNumber}")
        '*' -> println("Ответ: ${firstNumber * secondNumber}")
        '/' -> {
            if (secondNumber == 0.0) {
                println("Ошибка: деление на ноль")
            } else {
                println("Ответ: ${firstNumber / secondNumber}")
            }
        }
        else -> println("Недопустимая операция")
    }
}