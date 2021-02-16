package one.digitalinnovation.digitalonebank

class Pessoa {

    var nome: String = ""
    var cpf: String = ""

}

fun main() {
    val celso = Pessoa()
    celso.nome = "Celso Furtado"
    celso.cpf = "123.123.123-11"

    println(celso.nome)
    println(celso.cpf)
}