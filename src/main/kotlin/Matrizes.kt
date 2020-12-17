package main.kotlin

fun main() {
    val arrayInt = arrayOf(1, 2, 3, 4)
   // println("Array size: ${arrayInt.size}")
  //  println("Arrya Indice ${arrayInt[0]}")

    for (numero in arrayInt) {
     //   println("Elemento Int: $numero")
    }

    val arrayTipos = arrayOf(4,9,5,"MG",false)
    //println("Array com numeros ${arrayTipos.size}")
   // println("Array com numeros ${arrayTipos[3]}")

    val intArrayOf = intArrayOf(1, 2, 4)

    for (numero in arrayTipos) {
       // println("Elemento: $numero")
    }

    for ((index, numero) in arrayTipos.withIndex()) {
      //  println("Indice: $index - Elemento: $numero")
    }

    val joao = "Joao da silva xavier"
    var totalDeLetras = joao.length
    println("\n Total de Letras: $totalDeLetras")
    println("Letra:" + joao[3])

    for (letra in joao) {
        println("Letra: $letra")
    }
}