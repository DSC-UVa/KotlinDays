/** Haz una aplicación que calcule el área de un círculo(pi*R2).
 *  El radio se pedirá por teclado (recuerda pasar de String a double con Double.
 * parseDouble). Usa la constante PI y el método pow de Math. */

fun main(){
    print("introduce el radio para calcular el area: ")
    val radio = readLine()!!.toDouble()
    val area=Math.PI*Math.pow(radio, 2.0)
    println("El area del radio $radio es: $area")
}