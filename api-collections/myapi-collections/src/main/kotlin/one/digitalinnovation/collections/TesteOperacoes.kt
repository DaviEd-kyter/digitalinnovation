package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("==============================")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    // maior que 2500
    val salariosFilter = salarios.filter { it > 2500.00 }
    println("====================")
    salariosFilter.forEach { println(it) }

    println("====================")
    // quantos elementos vai ter no array dentro do range
    println(salarios.count{it in 2000.0..5000.0})

    println("====================")
    //buscar um valor específico
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 550.00 })

    println("====================")
    //vai procurar na coleção validando
    //qual elemento consegue deixar verdadeira
    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 500.00})
}