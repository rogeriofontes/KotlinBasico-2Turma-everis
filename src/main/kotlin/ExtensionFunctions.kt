fun String.lastCharacter(): Char = this.get(this.length-1)
fun String.removePrimeiroCaracter(): String = this.substring(1, this.length-1)

fun main() {
    var ultimaLetra = "Rogerio".lastCharacter()
    println(ultimaLetra)

    var removePrimeiroCaracter = "Rogerio".removePrimeiroCaracter()
    println(removePrimeiroCaracter)
}