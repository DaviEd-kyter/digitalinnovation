package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val neli = Gerente("Neli Pereira", "2564456499", 9000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(neli)

    TesteAutenticacao().autentica(neli)

}
