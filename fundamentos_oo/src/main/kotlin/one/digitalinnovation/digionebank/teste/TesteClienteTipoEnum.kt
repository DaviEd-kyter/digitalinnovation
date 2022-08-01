package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {elemento ->
    println("${elemento.name} - ${elemento.descricao}")

    } // Ou desta forma com it sem descrever exatamente

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")

    }//Ou essa Objeto como estivesse em uma classe

    val pf = ClienteTipo.PF
    println(">>${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">>${pj.name} - ${pj.descricao}")
}
