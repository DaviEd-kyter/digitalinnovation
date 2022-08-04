package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 6, 9, 7)

    values.forEach {
        println(it)
    }
    println("===================================")
    values.sort()
    values.forEach {
        println(it)
    }
}