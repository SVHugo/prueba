/*
 1) Cree una aplicación que le pedirá un nombre de usuario y luego una habilidad.
  Luego, el programa imprimirá "nombre es habilidad"
* */
fun main() {
    var nombreUsu: String
    var habilidad: String
    println("**********")
    println("Pregunta 1")
    println("**********")
    println("Por favor digite un nombre:")
    nombreUsu = readln()!!.toString()
    println("Por favor digite su Habilidad")
    habilidad = readln()!!.toString()
    println("El usuario: ${nombreUsu} tiene como habilidad: ${habilidad}")
    println("**********")

}