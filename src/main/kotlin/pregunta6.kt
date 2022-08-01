fun main() {
    /*
    *Crea una función que multiplique dos números decimales.
    * */
    var n1:Double= 15.0
    var n2:Double=5.0

    println("Pregunta 6")
    println("**********")
    println("Multiplicacion de numeros decimales")
    println("Numero 1: ${n1}")
    println("Numero 2: ${n2}")

    println(multiplicacion(n1,n2))
}

fun multiplicacion(a:Double,b:Double):String{

    var result:Double = (a * b)
    return  "El resultado de la multiplicacion es:" +result
}