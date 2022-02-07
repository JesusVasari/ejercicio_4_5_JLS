class dado (var valor :Int=1){

    fun tirar(){
        valor = ((Math.random() *6)  +1).toInt()
    }
    fun imprimir(){
        print("el valor es: $valor  ")
    }
}

fun main(){

    val dados : Array<dado> = arrayOf(dado(),dado(),dado(),dado(),dado())

    for( dado in dados)
        dado.tirar()
    for( dado in dados)
        dado.imprimir()
}