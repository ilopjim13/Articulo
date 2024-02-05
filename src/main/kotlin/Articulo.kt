class Articulo(var nombre:String, var precio:Int) {


    companion object {
        var id = 0
        init {
            this.id++
        }
    }

    fun promocionNavidad(porciento:Int) = this.precio - (this.precio * (porciento / 100))

    override fun toString() = "${this.nombre} - %.2f€ (ID: ${this.id})".format(this.precio)

}