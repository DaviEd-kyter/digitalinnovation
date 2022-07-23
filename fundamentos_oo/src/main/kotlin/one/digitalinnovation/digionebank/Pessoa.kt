package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Davi"

    var cpf: String =  "123.123.123-11"
    private set
}

fun main(){
    val davi = Pessoa()

    println(davi.nome)
    println(davi.cpf)
}

