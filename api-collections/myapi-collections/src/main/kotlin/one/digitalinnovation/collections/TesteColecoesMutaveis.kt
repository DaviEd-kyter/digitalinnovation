package one.digitalinnovation.collections

fun main() {
    val davi = Funcionario("Davi", 1500.0, "CLT")
    val neli = Funcionario("Neli", 1000.0, "PJ")
    val eduardo = Funcionario("Eduardo", 2500.0, "CLT")
    val marcela = Funcionario("Marcela", 2000.0, "PJ")

    val funcionarios = mutableListOf(davi, neli)
    funcionarios.forEach { println(it) }

    println("=====================")

    funcionarios.add(marcela)
    funcionarios.forEach { println(it) }

    println("=====================")
    funcionarios.remove(neli)
    funcionarios.forEach { println(it) }

    println("==========SET===========")
    val funcionarioSet = mutableListOf(marcela)
    //funcionarioSet.forEach { println(it) }

    funcionarioSet.add(neli)
    funcionarioSet.add(eduardo)
    funcionarioSet.forEach { println(it) }

    println("=====================")
    funcionarioSet.remove(eduardo)
    funcionarioSet.forEach { println(it) }
}