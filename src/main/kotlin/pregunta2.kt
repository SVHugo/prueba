import kotlin.math.*

fun main() {
/*
* Cree una aplicación que solicite un número entero
* e imprima su segunda potencia (x al cuadrado).
*
* */
    println("Pregunta 2")
    var randomNumber = 2;
    println("Ingrese Un número entero")
    randomNumber = readln().toInt()
    var result = Math.pow(randomNumber.toDouble(),2.toDouble())
    print("La Potenciación al cuadrada de : ${randomNumber} es : ${result}")
}