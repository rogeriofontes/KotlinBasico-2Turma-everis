package main.kotlin

fun main() {
    val nome = "Rogério"
    val sobrenome: String = "Fontes"

   // nome = "Rogério" //Kotlin: Val cannot be reassigned

    var nomecompleto = nome +  " " + sobrenome

    println(nomecompleto)
}
