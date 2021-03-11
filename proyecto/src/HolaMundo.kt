import kotlin.math.pow
fun selMode(): String? {
    println("Selecciona que operacion realizar: \n sumar(+) \n restar(-) \n multiplicar(*) \n dividir(/)")
    return readLine()
}

fun sumar(num1:Int, num2:Int): Int{
    return num1 + num2
}

fun restar( num1:Int, num2:Int):Int{
    return num1 - num2
}


fun main() {
  println("Ingrese los numeros que quiere sumar: ")
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    var mode = selMode()
    var salida = when(mode){
        "+" -> sumar(num1,num2)
        "-" -> restar(num1,num2)
        // "/" -> dividir(num1,num2)
        else -> null
    }
    println("$salida")

    println({a:Int, b:Int -> a*b}(32,34))
}