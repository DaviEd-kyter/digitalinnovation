package one.digitalinnovation.collections

fun main() {
    // atribuimos cada posiçao um valor e fez a interaçao
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 700.0


    salarios.forEach {
        println(it)
    }
    //modificando o valor naquele index, no caso aumento
    println("=======================")
    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    //Ordena com sort e imprime
    println("========================")
    val bonus = doubleArrayOf(1500.00, 1200.0, 5000.0)
    bonus.sort()
    bonus.forEach {
        println(it)
    }
}