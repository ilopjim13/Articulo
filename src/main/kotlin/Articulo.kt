/**
 * Clase abierta de articulos
 */
open class Articulo(var nombre:String, var precio:Double) {

    val id:Int
    init {
        id = ++ident
    }

    companion object {
        var ident:Int = 0

    }

    open fun promocionNavidad(porciento:Double) = this.precio - (this.precio * (porciento / 100))

    override fun toString() = "${this.nombre} - %.2f € (ID: ${id})".format(this.precio)

}