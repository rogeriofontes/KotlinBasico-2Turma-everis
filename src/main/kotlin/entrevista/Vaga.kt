package entrevista

class Vaga {

    var nome: String = ""
    var descricao: String = ""
    var requisitos: String = ""
    var desejavel: String = ""
    var quantidade: Int = 0
    val tipoContrato = arrayOf("CLT", "PJ")
    var projeto: Projeto = Projeto()
}