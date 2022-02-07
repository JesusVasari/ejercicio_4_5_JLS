
fun main() {

    var array = Array(20) { ((Math.random() * 21)).toInt() }
    for (a in array) {
        if (a % 2 == 0)
            println(a)


    }
    array.sort()
    println("imprime el último")
    println(array.lastIndex)
    println("imprime el primero")
    println(array.first())
    println("la suma de la array es: ${array.sum()}")
}