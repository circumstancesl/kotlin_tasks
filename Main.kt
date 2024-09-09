import kotlin.io.println

fun main() {
    val array = arrayOf(4, 8, 2, 1, 3, 6, 7, 12, 9)

    println("цикл for:")
    for (index in 1 until array.size - 1) {
        if (array[index] > array[index - 1] && array[index] > array[index + 1]) {
            println(array[index])
        }
    }

    println("\nцикл while:")
    var index = 1
    while (index < array.size - 1) {
        if (array[index] > array[index - 1] && array[index] > array[index + 1]) {
            println(array[index])
        }
        ++index
    }

    println("\nоператор forEach:")
    array.slice(1 until array.size - 1)
        .forEachIndexed { index, value ->
            if (value > array[index] && value > array[index + 2]) {
                println(value)
            }
        }
}
