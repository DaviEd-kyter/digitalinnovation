package one.digitalinnovation.collections

fun main() {
    // passando o tipo
    val nomes = Array<String>(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Kyter"
    nomes[2] = "Eduardo"

    for (nome in nomes){
        println(nome)
    }
    println("==========================")
    nomes.sort()
    nomes.forEach {
        println(it)
    }
    // declarando o tipo ele ja infere
    val nomes2 = arrayOf("Maria", "Kyter", "Neli")
    println("==============================")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}