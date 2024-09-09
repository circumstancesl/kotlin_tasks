import kotlin.io.println

fun main() {
    // task 9-1
    val numbers = listOf(-3, 5, -8, 10, -4, 7, 2, -1)
    val negativeNumbers = numbers.filter { it < 0 }
    println("Отрицательные числа: $negativeNumbers")

    // task 9-2
    val reverseNumbers = listOf(1, -2, 3, -4, 5, -6, 7)
    val modifiedNumbers = reverseNumbers.map { if (it > 0) -it else it }
    println("Список с измененными знаками: $modifiedNumbers")

    // task 9-3
    val squaredNumbers = numbers.map { it * it }
    println("Список квадратов: $squaredNumbers")

    // task 9-4
    val newNumbers = (1..7).toList()
    val sumString = newNumbers.joinToString(prefix = "=", postfix = "=", separator = "+")
    println(sumString)

    // task 9-5
    val phoneBook = mapOf("Alice" to "+8926789", "Snake" to "+1161364", "Elena" to "+8447", "Semyon" to "+89977", "Hisao" to "+402063127")
    val countryCode = "+8"
    val filteredPhoneBook = phoneBook.filterValues { it.startsWith(countryCode) }
    println(filteredPhoneBook)

    // task 9-6
    println("Введите число от 0 до 100:")
    val number = readLine()?.toInt() ?: 0

    val result = when (number) {
        in 0..19 -> arrayOf("ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")[number]
        in 20..99 -> {
            val tens = arrayOf("", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")[number / 10]
            val ones = arrayOf("", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")[number % 10]
            "$tens $ones"
        }
        100 -> "сто"
        else -> "число вне диапазона"
    }
    println(result)

    // task 9-7
    val timeString = "01:20:12"
    val (hours, minutes, seconds) = timeString.split(":").map { it.toInt() }
    val totalSeconds = hours * 3600 + minutes * 60 + seconds
    println("Прошло $totalSeconds секунд с начала дня")
}
