fun main() {
    olaMundo()
    val olaMundoX = olaMundoX()
    println(olaMundoX)

    val concatenaNome = concatenaNome("Rogerion", "Fontes")
    println(concatenaNome)
}

fun olaMundo() {
    println("Ola")
}

fun olaMundoX(): String {
    return "E ai mundo X"
}

fun concatenaNome(nome: String, sobrenome: String): String {
    val saudacoes = olaMundoX()
    return "$saudacoes \t ($nome \t $sobrenome)"
}