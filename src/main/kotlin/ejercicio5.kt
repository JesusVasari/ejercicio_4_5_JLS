fun main() {

    val lista = List(100) { ((Math.random() * 21)).toInt() }

    var cuenta1 = 0
    var cuenta2 = 0
    var cuenta3 = 0

    lista.forEach { when(it) {
        in 1..4 -> cuenta1++
        in 5..8 -> cuenta2++
        in 10..13 -> cuenta3++
    } }

    println("la canridad entre 1 y 4 es: $cuenta1")
    println("la cantidad entre 5 y 8 es: $cuenta2")
    println("la cantidad entre 10 y 13 es: $cuenta3")

    if (lista.contains(20))
        println()


} 