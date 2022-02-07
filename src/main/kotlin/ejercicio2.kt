fun main() {
    /*
    Realizar un programa que pida la carga de dos arreglos numéricos enteros de 4 elementos.
    Obtener la suma de los dos arreglos elemento a elemento, dicho resultado guardarlo en un tercer arreglo del mismo tamaño.
     */

    val array1 = IntArray(4)
    val array2 = IntArray(4)

    for (i in array1.indices) {
        println("ingrese número en la primera array")
        array1[i] = readLine()!!.toInt()
    }
    for (i in array2.indices) {
        println("ingrese númerop en la segunda array")
        array2[i] = readLine()!!.toInt()
    }
    val suma = IntArray(4)
    for (i in suma.indices)
        suma[i] = array1[i] + array2[i]

    for (valor in suma)
        println(valor)
}