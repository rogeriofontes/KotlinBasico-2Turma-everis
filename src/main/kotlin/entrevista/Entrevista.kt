package entrevista

import java.time.LocalDateTime

class Entrevista {

    var participantes: ArrayList<Array<String>> = ArrayList()
    var dataAgendamento: LocalDateTime = LocalDateTime.now()
    var local: String = ""
    var vaga: Vaga = Vaga()
    var candidato: Candidato = Candidato()
    var entrevistador: Entrevistador = Entrevistador()
}