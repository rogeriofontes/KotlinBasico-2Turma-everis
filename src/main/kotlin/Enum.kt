
//Strategy Patterns

fun main() {

   // var limite = TipoCartao.PLATINUM.
    //println("O Limite do cartao ${TipoCartao.PLATINUM} é de $limite")

    var cashBack = TipoCartao.PLATINUM.calculaCashBack(1000.99F)
    println("O Limite do cartao ${TipoCartao.PLATINUM} é de $cashBack")

    println("Tipo ${TipoCartao.GOLD}")

    for (tipoCartao in TipoCartao.values()) {
        println("Tipo cartao $tipoCartao")
    }
}

enum class TipoCartao(val limite: Int): CalculaCashBack {
    NORMAL(100) {
       /* override fun calculaCashBack(value: Float): Float {
           return value * 10 / 100
        } */

        /*override fun getLimite(): Int {
            return 100
        }*/

        override fun calculaCashBack(value: Float) = value * 10 / 100
    }, GOLD(500) {
        /* override fun calculaCashBack(value: Float): Float {
            return value * 50 / 100
        }*/

       /* override fun getLimite(): Int {
            return 500
        }*/
       override fun calculaCashBack(value: Float) = value * 50 / 100
    }, PLATINUM(1000) {
       /*override fun calculaCashBack(value: Float): Float {
            return value * 150 / 100
        } */

        /*override fun getLimite(): Int {
            return 1000
        }*/
        override fun calculaCashBack(value: Float) = value * 150 / 100
    }, BLACK(10000) {
        /*override fun calculaCashBack(value: Float): Float {
            return value * 250 / 100
        }*/

        override fun calculaCashBack(value: Float) = value * 250 / 100
        /*override fun getLimite(): Int {
            return 10000
        }*/
    };

   //abstract fun calculaCashBack(value: Float): Float
   // abstract fun getLimite(): Int
}

interface CalculaCashBack {
    fun calculaCashBack(value: Float): Float
}