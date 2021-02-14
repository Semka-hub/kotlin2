const val a: Double = 11.37
const val b: Double = 691.431

fun main() {
    // Задание 1
    val average = (a + b) / 2
    println("Average value is $average")

    // Задание 2
    val task2 = FirstLastName()
    task2.print()

    // Задание 3
    fibonacci(15)

    // Задание 4
    val arr: Array<Int> = Array(10) { i -> i + 1 }
    arr.shuffle()
    println("Массив до сортировки: ${arr.contentToString()}")
    bubbleSort(arr)
    println("Массив после сортировки: ${arr.contentToString()}")

    // Задание 5
    print("Введите строку: ")
    var text = readLine()!!
    for (i in text.length - 1 downTo 0) {
        if (text[i] !in '0'..'9') {
            try {
                val num = text.substring(i + 1, text.length).toInt() + 1
                text = text.replace((num - 1).toString(), num.toString())
                print(text)
                break
            } catch (e: NumberFormatException) {
                println("Неверный формат строки")
                break
            }
        }
    }
}

class FirstLastName {
    private val firstName: String = "Semen"
    private val lastName: String = "Golubev"

    fun print() {
        println("Full name: $firstName $lastName")
    }
}

fun fibonacci(n: Int) {
    var f1 = 0
    var f2 = 1
    var sum = 1

    println("Чилса Фибоначчи:\n1. $f1\n2. $f2")
    for (i in 3..n) {
        println("${i}. $sum")
        f1 = f2
        f2 = sum
        sum = f1 + f2
    }
}

fun bubbleSort(a: Array<Int>) {
    for (i in 0..a.size) {
        for (j in 0..(a.size - 2 - i)) {
            if (a[j] > a[j + 1]) {
                val temp = a[j]
                a[j] = a[j + 1]
                a[j + 1] = temp
            }
        }
    }
}