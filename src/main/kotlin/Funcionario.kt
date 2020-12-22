fun main() {

    val funcionario = Gerente(nome = "Rogerio", salario = 50000.00, matricula = 32332)
    val funcionario1 = Gerente(nome = "Rogerio", salario = 50000.00, matricula = 32332)
    val funcionario2 = Gerente(nome = "Rogerio", salario = 50000.00, matricula = 32332)
    val funcionario3 = Gerente(nome = "Rogerio", salario = 50000.00, matricula = 32332)
    val funcionario5 = Gerente(nome = "Rogerio", salario = 50000.00, matricula = 32332)

    var listaDeGerentes = mutableListOf<Gerente>()
    listaDeGerentes.add(funcionario)
    listaDeGerentes.add(funcionario1)
    listaDeGerentes.add(funcionario2)
    listaDeGerentes.add(funcionario3)
    listaDeGerentes.add(funcionario5)

    for ((id, gerente) in listaDeGerentes.withIndex()) {
        println("Gerente: ${gerente.nome} na posicao $id")
    }

    //println("Nome default: ${funcionario.nome}")

    //funcionario.nome = "Rogerio"
   // funcionario.matricula = 32332
    //funcionario.especializacao = "Gerencia de Risco"

   // println(funcionario.toString())

    //println("Nome mudado: ${funcionario.nome}")

    //var desenvolvedor = Desenvolvedor("Rogerio", 123456, "Java", 1000.99, "16 anos")

    //println("O desenvovedor: ${desenvolvedor.nome}, tem experiencia de ${desenvolvedor.experiencia}")

   //println("toString data class: ${desenvolvedor.toString()}")
}


open abstract class Funcionario(open var nome:String  = "Joao", open var matricula:Long = 123456, open var salario:Double = 50000.00) {
   // var nome:String = "Joao"
   // var matricula:Long
    //var salario:Double = 50000.00
    //private set

    open fun calculaBonus(bonus: Double): Double {
      return this.salario + bonus
    }
}

class Gerente(override var nome:String, override var matricula:Long, override var salario:Double): Funcionario(nome, matricula, salario), Musico, Mecanico {
    var especializacao:String = "Adminstacao"

    /*constructor(especializacao: String) {
        this.especializacao = especializacao
    }

    constructor(especializacao: String, id: Int) {
        this.especializacao = especializacao
    }

    constructor(especializacao: String, id: Int, qualquerCoisa: String) {
        this.especializacao = especializacao
    }*/

    override fun calculaBonus(bonus: Double): Double {
        return this.salario + bonus + 1
    }

    override fun tocaBateria() {
        println("Toca bateria")
    }

    override fun tocaGuitarra() {
        println("play Guitarra com caron")
    }

    override fun trocaMotor() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return super.toString()
    }

    init {
        println("Vou ser executado primeiro")
    }

    init {
        println("Vou ser executado segundo")
    }

    init {
        println("Vou ser executado terceiro")
    }

}

interface Musico {
    fun tocaBateria()

    fun tocaGuitarra() {
        println("play Guitarra")
    }
    fun tocaBaixo() {
        println("play Baixo")
    }
}

interface Mecanico {
    fun trocaMotor()
}

data class Desenvolvedor(var nome: String, var matricula: Int, var tecnologia: String, var salario: Double, var experiencia: String)