package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
val neli = Cliente(
    nome = "Neli Pereira",
    cpf = "123.123.456-88",
    clienteTipo = ClienteTipo.PJ,
    senha = "123456"

)
    println(neli)

    TesteAutenticacao().autentica(neli)
}
