fun main() {
    val idade: Int = 15;

    if (idade > 18) {
        println("Você é maior de idade!")
    } else if (idade <= 60) {
        println("Você não é maior de idade e está no periodo de trabalho!")
    } else if (idade > 60) {
        println("Vc pode aposentar")
    }

    var qualIdade: String = if (idade < 18) "Menor de idade" else "Maior de idede"
    println(qualIdade)

    var qualIdade1: String = if (idade < 18) {
         println("Maior de idade")
        "Menor de idade"
    } else {
        "Maior de idade"
    }
    println(qualIdade1)
}