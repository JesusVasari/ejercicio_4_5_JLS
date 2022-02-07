fun main(args: Array<String>) {


    /*
    Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
     El valor acumulado de todos los elementos.
     El valor acumulado de los elementos que sean
     ----mayores a 36.
     -----Cantidad de valores mayores a 50.
     (Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar cada elemento)
     */


    val array = IntArray(8)
    for (i in 0..array.size-1) {
        println("ingrese número")
        array[i]= readLine()!!.toInt()
    }
    var sum = 0
    var mayor36 = 0
    var mayor50 = 0

    for (valor in array){
        sum +=valor
        if( valor >36)
            mayor36 ++
        if( valor>50)
            mayor50 ++
    }


        println("la cantidad de elementos en array es: $sum")
        println("la cantidad de elementos mayores a 36 son: $mayor36")
        println("la cantidad de elementos mayores a 50 son: $mayor50")

}