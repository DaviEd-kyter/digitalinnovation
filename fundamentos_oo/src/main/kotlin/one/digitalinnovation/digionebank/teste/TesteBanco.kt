package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Banco

fun main(){
    val kyterOneBank = Banco("KyterOne", 15)

    println(kyterOneBank.nome)
    println(kyterOneBank.numero)

    val banco2 = kyterOneBank.copy(nome = "Kyter2")
    println(banco2.info())
}