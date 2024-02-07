/**
 * Clase hija Ordenador que hereda de Articulo
 */
class Ordenador(nombre:String, precio:Double,var tipo:TipoOrdenador = TipoOrdenador.BASICO) : Articulo(nombre, precio) {

    /**
     * Calcula el precio con la promocion de navidad si es mayor a 500€
     */
    override fun promocionNavidad(porciento: Double): Double {
        return if (this.precio > 500.0) super.promocionNavidad(porciento)
        else this.precio
    }
}