fun main() {

    val articulo1 = Articulo("tomate", 25.0)
    val articulo2 = Articulo("reloj", 45.0)

    val ordenador1 = Ordenador("Ordenador 1", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("Ordenador 2", 399.99, TipoOrdenador.BASICO)

    // Lista de todos los artículos
    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    articulos.forEach{ println(it)}


}