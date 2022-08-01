fun main() {
    /*
    *Crea una clase que te permite generar automóviles con
    * sus características, por ejemplo:
    * (Mazda, 2008, KT (Modelo), 24L (Capacidad de Llenado),
    *  etc..)
    * */
    val automoviles = Automoviles();
    println("Pregunta 4")
    println("**********")
    println("Caracteristica de mi Automovil")
    println("Modelo: ${ automoviles.modelo}" +"\n"+
            "Capacidad de personas: ${automoviles.capacidad}" +"\n"+
            "Marca de Asientos: ${automoviles.marcaAsientos}" +"\n"+
            "Peso: ${automoviles.peso}")
}