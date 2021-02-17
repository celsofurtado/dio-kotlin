package one.digitalinnovation.digitalonebank.teste

import one.digitalinnovation.digitalonebank.Funcionario
import java.math.BigDecimal

fun main() {

    val joao = Funcionario("João", "78787878", BigDecimal.valueOf(4500))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}