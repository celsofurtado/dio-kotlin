package one.digitalinnovation.digitalonebank.teste

import one.digitalinnovation.digitalonebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("${pf.descricao} - ${pf.name}")
}