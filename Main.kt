import kotlin.io.println

class NumberArray(private val array: IntArray) {

    fun sumOfPositiveElements(): Int {
        var sum = 0
        array.forEach { if (it > 0) sum += it }
        return sum
    }

    fun productOfElements(): Long {
        var product: Long = 1
        array.forEach { product *= it.toLong() }
        return product
    }

    fun averageOfElements(): Double {
        var sum = 0
        array.forEach { sum += it }
        return sum.toDouble() / array.size
    }
}

fun main() {
    val numberArray = NumberArray(intArrayOf(2, -4, 7, 1, -6, 7))

    println("Сумма положительных элементов: ${numberArray.sumOfPositiveElements()}")
    println("Произведение элементов: ${numberArray.productOfElements()}")
    println("Среднее арифметическое: ${numberArray.averageOfElements()}")
}
