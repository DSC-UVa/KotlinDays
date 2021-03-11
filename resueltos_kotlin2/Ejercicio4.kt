/* Modifica la aplicación anterior,
 para que nos pida el nombre que queremos introducir. */

fun main(){
    print("Escriba su nombre: ")
    val nombre = readLine()!!.toString()
    println("Bienvenido $nombre")
}