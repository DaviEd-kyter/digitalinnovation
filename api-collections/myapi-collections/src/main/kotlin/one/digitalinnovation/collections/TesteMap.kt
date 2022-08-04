package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Davi", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - valor: $v")}

    // função infix
    val map2 = mapOf(
        "Eduardo" to  3800.0,
        "Neli" to 2500.0
    )
    map2.forEach{(k, v) -> println("Chave: $k - valor: $v") }
}