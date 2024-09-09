import kotlin.io.println

fun main() {
    val words: List<String?> = listOf("apple", "no" , null, "yes", null)

    println("Используя оператор if:")
    for (word in words) {
        if (word != null) {
            println(word.uppercase())
        }
    }

    println("\nИспользуя оператор безопасного вызова ?:")
    words.forEach { println(it?.uppercase()) }

    println("\nИспользуя функцию let:")
    words.forEach { it?.let { word -> println(word.uppercase()) } }

    println("\nИспользуя Элвис-оператор ?: и функцию let:")
    words.forEach { it?.let { word -> println(word.uppercase()) } ?: println("empty") }
}
