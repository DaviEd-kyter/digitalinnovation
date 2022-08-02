package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2
    // valores dentro do array até terminar
    // interar para gerar valores
    for (valor in values){
        println(valor)
    // 2° Forma: it faz o papel do valor, array utilizando uma função lambida
    // para tal variavel
    }
    println("=================================")
    values.forEach {
        println(it)
    }
    //3° Forma: utilizando indice que esta sendo interado
    println("=================================")
    for (index in values.indices){
        println(values[index])
    }
    //4° Forma: Sort ele ordena do menor para o maior
    println("=================================")
    values.sort()
    for (valor in values){
        println(valor)
    }
}