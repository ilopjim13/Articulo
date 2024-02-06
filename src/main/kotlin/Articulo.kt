class Articulo(var nombre:String, var precio:Double) {

    val id:Int
    init {
        id = ++ident
    }

    companion object {
        var ident:Int = 0

    }

    fun promocionNavidad(porciento:Int) = this.precio - (this.precio * (porciento / 100))

    override fun toString() = "${this.nombre} - %.2f € (ID: ${id})".format(this.precio)

}