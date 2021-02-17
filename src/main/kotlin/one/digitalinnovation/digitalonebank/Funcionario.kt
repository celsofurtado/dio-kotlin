package one.digitalinnovation.digitalonebank

import java.math.BigDecimal

class Funcionario(
    nome:String,
    cpf:String,
    val salario:BigDecimal
) : Pessoa(nome, cpf) {
}