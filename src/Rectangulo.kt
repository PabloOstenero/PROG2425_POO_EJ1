class Rectangulo (val base: Double, val altura: Double) {

    val area: Double
        get() = calculararea()

    val perimetro: Double
        get() = calcularperimetro()

    init {
        require(base > 0.0) {"La base debe ser mayor que 0"}
        require(altura > 0.0) {"La altura debe ser mayor que 0"}
    }

    private fun calculararea(): Double {
        return altura * base
    }

    private fun calcularperimetro(): Double {
        return altura
    }

    override fun toString(): String {
        return "Base: ${this.base}, Altura: ${this.altura}"
    }
}
