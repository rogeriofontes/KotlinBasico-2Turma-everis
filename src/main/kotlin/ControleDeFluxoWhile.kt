fun main() {
    var i = 1

    while (i <= 5) {
        println("incremento $i")
        ++i
    }

    var sum = 0
    var j = 100

    while (j != 0 && i < 1000) {
        sum += i
        --j
    }

    println("Somatoria: $sum")
}