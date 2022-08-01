fun main() {
/*
* Crea una función que compruebe que un nuevo sea par o impar.
* */
    var xnumber : Int
    println("Pregunta 5")
    println("***********")
    println("¿Es par o Impar?")
    println("Por favor digite un número:")
    xnumber = readln().toInt()
    if (xnumber % 2 == 0){
        println("El numero : ${xnumber} es par")
    }else{
        println("El numero : ${xnumber} es impar")
    }

}