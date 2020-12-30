package br.com.everis.entrevista

fun main() {
    var desenvolvedorRogerio = Desenvolvedor("Rogerio1", 41, 83837)
   // println("O desenvolvedor é $desenvolvedor")

    var desenvolvedorJose = Desenvolvedor("Jose", 23, 112342)
   // println("O desenvolvedor é $desenvolvedor1")

    var desenvolvedorMaria = Desenvolvedor("Maria", 33, 112342)

    var desenvolvedores = mutableListOf<Desenvolvedor>()
    desenvolvedores.add(desenvolvedorRogerio)
    desenvolvedores.add(desenvolvedorJose)
    desenvolvedores.add(desenvolvedorMaria)

    desenvolvedores.forEach oi@{ // jump com label
        desenvolvedor ->
        if (desenvolvedor.idade < 13)
            return@oi
        else
            return@oi

        println("O desenvolvedor é ${desenvolvedor.nome}")
    }
}

class Desenvolvedor(var nome: String = "", var idade: Int = 0) {

    var nomeInterno: String = ""
    var idadeInterno: Int = 0

    init {
        if (nome == "Rogerio") {
             nomeInterno = "NA"
             idadeInterno = 0
        } else {
            nomeInterno = nome.toUpperCase()
            idadeInterno = idade
        }

        println("Desenvolvedor nome: $nomeInterno idade: $idadeInterno")
    }

    init {
        nomeInterno = nome.toLowerCase();
        println("Desenvolvedor: $nomeInterno")
    }

    constructor(nome: String, idade: Int, matricula: Int): this(nome, idade) {
        println("Desenvolvedor - Nome: ${nome.toUpperCase()} - idade: $idade - matricula $matricula ")
    }

    constructor(nome: String, idade: Int, matricula: Int, celular: String): this(nome, idade) {
        println("Desenvolvedor - Nome: ${nome.toUpperCase()} - idade: $idade - matricula $matricula ")
    }

    constructor(nome: String): this(nome, 0){

    }

    override fun toString(): String {
        return "Desenvolvedor(nome='$nome', idade=$idade)"
    }
}