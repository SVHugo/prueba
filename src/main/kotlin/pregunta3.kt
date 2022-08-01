import kotlin.math.pow

fun main() {
    /*
    *Crea una aplicación que te pida el radio de un círculo.
    *  Luego imprime su circunferencia y su área.
    *
    * */
    var xradio:Double
    var pi = 3.1416
    println("Pregunta 3")
    println("**********")
    println("Digite un número radio de un circulo: ")
    xradio = readln()!!.toDouble()


    var radio = xradio.pow(2)
    var area = radio * pi
    var circunderencia = 2 * pi * xradio
    println("Radio Digitado: ${xradio}")
    println("Area: ${area}")
    println("Circunferencia: ${circunderencia}")





}