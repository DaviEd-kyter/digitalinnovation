package one.digitalinnovation.collections

fun main() {
    val davi = Funcionario("Davi", 1500.0, "CLT")
    val neli = Funcionario("Neli", 1000.0, "PJ")
    val eduardo = Funcionario("Eduardo", 2500.0, "CLT")
    val marcela = Funcionario("Marcela", 2000.0, "PJ")

    val funcionarios = listOf(davi, neli, eduardo, marcela)
    //it representa o funcionário
    funcionarios.forEach { println(it) }

    println("======================")
    //encontrar apenas um elemento (neli)
    println(funcionarios.find { it.nome == "Neli" })

    println("======================")
    //Sort por algo... for Each finaliza todas operaçoes da nossa coleção
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("======================")
    //dado uma lista de funcionario agrupe tipo de contratação e imprime
    funcionarios
        .groupBy { it.tipocontratacao }
        .forEach{println(it)}

    //UTILIZANDO UMA LISTA DA API COLLECTION NAO CONSEGUE FAZER ADIÇÃO DE ALGO NOVO
}
