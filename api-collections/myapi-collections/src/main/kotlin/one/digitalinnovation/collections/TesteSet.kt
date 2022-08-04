package one.digitalinnovation.collections

fun main() {
    val davi = Funcionario("Davi", 1500.0, "CLT")
    val neli = Funcionario("Neli", 1000.0, "PJ")
    val eduardo = Funcionario("Eduardo", 2500.0, "CLT")
    val marcela = Funcionario("Marcela", 2000.0, "PJ")

    val funcionarios1 = setOf(davi, neli, eduardo)
    val funcionarios2 = setOf(marcela)
    //uni dois conjuntos
    val resultunion = funcionarios1.union(funcionarios2)
    resultunion.forEach { println(it) }

    println("=============================")
    //criação de outro conjunto, retirando um conjunto neste caso o 2(marcela)
    val funcionarios3 = setOf(marcela, eduardo, neli)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("=============================")
    //intersectar apenas o que é comun entre dois conjuntos
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

}