class Articulo(var nombre:String, var precio:Int, id:Int) {
    companion object {
        var id = 0
        init {
            this.id++
        }
    }

    fun promocionNavidad() {

    }
}