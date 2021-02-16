package one.digitalinnovation.digitalonebank

class Pessoa {

    var nome: String = ""

    var cpf: String = "895-965-541-77"
    private set

    constructor()

    fun pessoaInfo() = "$nome -> $cpf"

}

fun main() {
    val celso = Pessoa()
    celso.nome = "Celso Furtado"
    //celso.cpf = "123.123.123-11"

    println(celso.pessoaInfo())
    println(celso.nome)
    println(celso.cpf)
}