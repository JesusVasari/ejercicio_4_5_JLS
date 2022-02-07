data class Articulo(val codigo: Int, val descripcion: String, var precio: Float) {


    fun imprimir(articulos: Array<Articulo>) {
        for (art in articulos)
            println("Código: ${art.codigo} - Descripción ${art.descripcion} Precio: ${art.precio}")
    }

    fun aumentar(articulos: Array<Articulo>) {
        for (art in articulos)
            art.precio = art.precio + (art.precio + 0.10f)
    }


}

fun main() {

    val articulos: Array<Articulo> = arrayOf(
        Articulo(0,"leche", 0.80f),
        Articulo(1,"queso", 0.20f),
        Articulo(2,"maiz", 100.0f),
        Articulo(3, "tomate", 0.10f)
    )

    println("lista de artículos")
    for (imp in articulos)
        imp.imprimir(articulos)

    for (aumenta in articulos)
        aumenta.aumentar(articulos)
}

