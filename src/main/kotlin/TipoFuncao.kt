fun main() {
    var essaVariavelEUmaFuncao = ::test
    essaVariavelEUmaFuncao()

    var classTipoFuncao = TipoFuncao()
    classTipoFuncao()

    val calculaSoma = ::calculaSoma
    var resultadoSoma = calculaSoma(100, 99)
    println("O resultado: $resultadoSoma")

    val calculaSomaComLambda: (Int, Int) -> Int = {
        x, y -> x + y
    }
    println(calculaSomaComLambda(99, 88))

    val calculaSomaComLambdaComInferencia = {
        x: Int, y: Int -> x + y
    }
    println(calculaSomaComLambdaComInferencia(77, 77))

    val calculaSomaComFuncaoAnonima = fun(x: Int, y: Int): Int {
       return x + y
    }
    println(calculaSomaComFuncaoAnonima(99, 88))

    //=====
    val calculoBonus: (salario: Double) -> Double = bonus@ {
        salario ->
        if(salario > 10000) {
            return@bonus salario + 100
        } else if(salario > 100000) {
            return@bonus salario + 1000
        }

        salario + 10
    }

    println(calculoBonus(10999.00))

    val calculaBonusAnomino = fun(salario: Double): Double {
        if(salario > 10000) {
            return salario + 100
        } else if(salario > 100000) {
            return salario + 1000
        }

        return salario + 10
    }

    println(calculaBonusAnomino(10999.00))
}

class TipoFuncao: () -> Unit {
    override fun invoke() {
        println("executando class do tipo funcao")
    }
}

fun test() {
    println("executando funcao text")
}

fun calculaSoma(x: Int, y: Int): Int {
    return x + y
}