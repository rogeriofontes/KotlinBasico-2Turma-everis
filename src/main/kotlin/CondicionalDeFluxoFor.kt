fun main() {

    val estados = listOf("MG", "SP", "RH")

    for (estado in estados)
        println("O Estado é: $estado")

    for ((index, estado) in estados.withIndex())
        println("O Estado é: $estado e o id: $index")

    //Lambda
    estados.forEach {
        estado -> println("O Estado é: $estado")
    }
}