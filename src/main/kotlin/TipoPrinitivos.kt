package main.kotlin

fun main() {
    val exInt = 55
    val exInt1: Int = 55
    val exLong = 56L
    val exLong1: Long = 56
    val exFloat = 34.99F
    val exFloat1: Float = 34.99F
    val exDouble: Double = 99.0
    val exDouble1 = 98.99
    val exHexadecimal = 0x0F
    var exBinary = 0b010101

   // println("O tipo é Int com valor: $exInt")
    //println("O tipo é Long com valor: $exLong")
   // println("O tipo é Float com valor: $exFloat")
   // println("O tipo é Double com valor: $exDouble")
   // println("O tipo é Hexadecimal com valor: $exHexadecimal")
    //println("O tipo é Binary com valor: $exBinary")

    val numeroInteiro = 99
    val numeroLong = numeroInteiro.toLong()

    val intValue = "101".toInt()

    if (numeroLong is Long) {
    //    println("É Long")
    }

    val exBooleanTrue = true
    val exBooleanFalse = false

    //println("\nA extBooleanTrue é $exBooleanTrue")
   // println("\nA extBooleanFalse é $exBooleanFalse")

    val exString = "Sou uma string"
    val exStringComScape = "$exString\n fsdfsad"

    val multipleStringLines = """
         Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
         Vestibulum mauris nulla, tempor eget eros quis, 
         convallis eleifend neque. Quisque nunc lectus, 
         faucibus vitae tempor ut, rutrum dignissim libero.
         $exString
        """

    println("Com multiline: $multipleStringLines")

    for (letra in multipleStringLines) {
        println("Letra: $letra")
    }

    val age = 40
    val outraMensagem = "Parabens: ${if (age > 60) "Vc pode estacinar perto do mercado" else "Vc nao pode usar vagas reservadas" }"
   // println("Messagem: $outraMensagem")
}


