/** Lee un número por teclado y comprueba que
 *  este numero es mayor o igual que cero,
 *  si no lo es lo volverá a pedir (do while),
 *  después muestra ese número por consola.
 */
fun main(){
    var num = 0
    do {
        print("introduce un numero mayor que 0: ")
        num = readLine()!!.toInt()
    }while(num<=0)
    println("El numero introducido es: $num")
}
