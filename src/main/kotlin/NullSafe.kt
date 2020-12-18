import java.lang.Exception

fun main() {
    var nome: String? = null
    nome = "Rogerio"
    nome?.length
    //println(nome)

    try {
        var sobrenome: String? = null
        //sobrenome = "Fontes"
        sobrenome!!.length
        println(sobrenome)
    } catch (ex: Exception) {
        println("Error: " + ex.message)
    }

    val nomeZe = "Ze Maria"
    val nomeRetornadoDoZe = if (nomeZe == "Ze Maria" && nomeZe != null) {
       // println(nomeZe)
    } else "nao conheco esse nome"

    val nomeRetornadoDoZe2 = nomeZe == "Ze Maria" ?: "Nao conheco esse nome"
    println(nomeRetornadoDoZe2)

    val tamanhoDoNome: Int = nomeZe?.length ?: -1
    //println(tamanhoDoNome)

    lateinit var animal: String

    animal = "Cavalo"
    println(animal)

    var carro: String? = null
    carro = "Fusca"
    carro.let {
        println("O carro é $carro")
        println("A Palavra $carro tem ${carro.length} caracteres")
    }
}