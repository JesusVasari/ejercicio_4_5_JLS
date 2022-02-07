fun aleatorio(conjunto: MutableList<Int>) {
    do {
        val generar = ((Math.random() * 50) + 1).toInt()
        conjunto.add(generar)
    } while (conjunto.size != 6)
}

fun numeros(valor: MutableList<Int>) {
    do {
        val generar = ((Math.random() * 50) + 1).toInt()
        valor.add(generar)
    } while (valor.size != 50)
}

fun contar(conjunto: MutableList<Int>, valor: MutableList<Int>) {
    var acierto = 0
    var contar = 0
    var intento = 0
    for (numero in valor) {
        contar++

        if (numero in conjunto) {
            acierto++
            if (acierto == 6) {
                intento = contar
            }
        }
    }
    println(" se hicieron $intento intentos")
}


fun main() {


    var conjunto: MutableList<Int> = mutableListOf()
    numeros(conjunto)
    println("se crea el conjunto")
    println(conjunto)



    var valor: MutableList<Int> = mutableListOf()
    numeros(valor)
    println("se crean los números")
    println(valor)

    contar(conjunto,valor)

}
