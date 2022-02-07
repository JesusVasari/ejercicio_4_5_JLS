class Empleado(val nombre: String, val sueldo: Int) {

    fun imprimir() {
        println("el nombre es $nombre y el sueldo es $sueldo")
    }

}
fun suma(emple: MutableList<Empleado>) {
    val suma = emple.sumOf{ it.sueldo }
    println("gatos:$suma")
}


fun main() {

    val emple: MutableList<Empleado> = mutableListOf(
        Empleado("pepe", 100),
        Empleado("juan", 1500),
        Empleado("luis", 1200)
    )

    emple.forEach { it.imprimir()}
    suma(emple)
    emple.add(Empleado("jose",1100))
    suma(emple)
}