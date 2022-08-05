package one.digitalinnovation.collections

fun main() {
    val davi = Funcionario("Davi", 1500.0, "CLT")
    val neli = Funcionario("Neli", 1000.0, "PJ")
    val eduardo = Funcionario("Eduardo", 2500.0, "CLT")
    val marcela = Funcionario("Marcela", 2000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(davi.nome, davi)
    repositorio.create(neli.nome, neli)
    repositorio.create(marcela.nome, marcela)

    println(repositorio.findByid(davi.nome))

    println("===================")
    repositorio.findAll().forEach { println(it) }

    println("===================")
    repositorio.remove(marcela.nome)
    println(repositorio.findAll().forEach { println(it) })


}