fun main() {
    // 1 - Juridico
    // 2 - Fisico

   val tipoPessoa:Int = 1
    var tipoPessoaReturn = when (tipoPessoa) {
        1 -> "Rozao Social: Comercio XYZ - CNPJ: 3333"
        2 -> "Nome: Jose -  CPF 12345"
        else -> {
            "Desconhecido"
            "Nao encontrado"
        }
    }

    println(tipoPessoaReturn)

    val idade: Int = 15

    when {
        idade > 18 -> println("Você é maior de idade!")
        idade <= 60 -> println("Você não é maior de idade e está no periodo de trabalho!")
        idade > 60 -> println("Vc pode aposentar")
    }
}