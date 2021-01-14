package entrevista

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Month
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {

    val entrevista = Entrevista()
    entrevista.vaga.nome = "Desenvolvedor Backend Kotlin"
    entrevista.vaga.descricao = "Procuramos desenvolvedores Kotlin motivados" +
                    " a trabalhar em times de alta performance."
    entrevista.vaga.requisitos = "Kotlin; Java 8+; APIs REST."
    entrevista.vaga.desejavel = "Inglês Avançado."
    entrevista.vaga.quantidade = 5
    val tipoContrato = entrevista.vaga.tipoContrato[0]

    entrevista.vaga.projeto.nome = "Financiamento Imobiliário"
    entrevista.vaga.projeto.descricao = "Desenvolvimento de uma API que faça calculos para" +
            " fazer financiamento de imóveis."
    entrevista.vaga.projeto.tempo = "1 ano podendo ser prorrogado por igual periodo."

    entrevista.candidato.nome = "José Fulano Ciclano"
    entrevista.candidato.telefone = "034 98888-7777"
    entrevista.candidato.email = "josefulanoc@email.com"
    val candidato = arrayOf(entrevista.candidato.nome,entrevista.candidato.telefone,entrevista.candidato.email )

    entrevista.entrevistador.nome = "Maria Tech"
    entrevista.entrevistador.cargo = "Tech Recruiter"
    val recrutador1 = arrayOf(entrevista.entrevistador.nome, entrevista.entrevistador.cargo)
    entrevista.entrevistador.nome = "João Tech Lead"
    entrevista.entrevistador.cargo = "Tech Lead"
    val recrutador2 = arrayOf(entrevista.entrevistador.nome, entrevista.entrevistador.cargo)
    entrevista.entrevistador.nome = "José Dev Senior"
    entrevista.entrevistador.cargo = "Dev Senior"
    val recrutador3 = arrayOf(entrevista.entrevistador.nome, entrevista.entrevistador.cargo)
    entrevista.entrevistador.nome = "Paula Dev Senior"
    entrevista.entrevistador.cargo = "Dev Senior"
    val recrutador4 = arrayOf(entrevista.entrevistador.nome, entrevista.entrevistador.cargo)
    entrevista.participantes = arrayListOf(candidato, recrutador1, recrutador2, recrutador3, recrutador4)

    entrevista.dataAgendamento = LocalDateTime.of(2021, Month.JANUARY, 18, 10, 30)
    entrevista.local = "via Skype"
    println()
    println("Vaga: ${entrevista.vaga.nome}\n" +
            "Descrição: ${entrevista.vaga.descricao}\n" +
            "Requisitos: ${entrevista.vaga.requisitos}\n" +
            "Desejável: ${entrevista.vaga.desejavel}\n" +
            "Tipo de contrato: $tipoContrato\n" +
            "Quantidade de vagas: ${entrevista.vaga.quantidade}\n")
    println("Projeto: ${entrevista.vaga.projeto.nome}\n" +
            "Descrição: ${entrevista.vaga.projeto.descricao}\n" +
            "Duração: ${entrevista.vaga.projeto.tempo}\n")
    println("Entrevista agendada para " +
            "${entrevista.dataAgendamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))}" +
            " às ${entrevista.dataAgendamento.format(DateTimeFormatter.ofPattern("HH:mm"))}.\n" +
            "Local: ${entrevista.local}.\n" +
            "Participantes:\n" +
            "   - Candidato: \n" +
            "       Nome: ${entrevista.participantes[0][0]}\n" +
            "       Telefone: ${entrevista.participantes[0][1]}\n" +
            "       E-mail: ${entrevista.participantes[0][2]}")
    print("   - Entrevistador: \n" +
            "       Nome: ${entrevista.participantes[1][0]}\n" +
            "       Cargo: ${entrevista.participantes[1][1]}\n" +
            "   - Entrevistador: \n" +
            "       Nome: ${entrevista.participantes[2][0]}\n" +
            "       Cargo: ${entrevista.participantes[2][1]}\n" +
            "   - Entrevistador: \n" +
            "       Nome: ${entrevista.participantes[3][0]}\n" +
            "       Cargo: ${entrevista.participantes[3][1]}\n" +
            "   - Entrevistador: \n" +
            "       Nome: ${entrevista.participantes[4][0]}\n" +
            "       Cargo: ${entrevista.participantes[4][1]}\n")
    println()
}