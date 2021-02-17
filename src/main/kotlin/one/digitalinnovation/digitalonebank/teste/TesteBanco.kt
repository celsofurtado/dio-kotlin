package one.digitalinnovation.digitalonebank.teste

import one.digitalinnovation.digitalonebank.Banco

fun main() {

    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco")

    println(banco2.nome)
    println(banco2.numero)

    println(banco2.info())

}