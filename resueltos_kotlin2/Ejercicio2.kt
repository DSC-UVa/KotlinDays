/* Declara 2 variables numéricas (con el valor que desees),
   he indica cual es mayor de los dos. Si son iguales indicarlo también.
   Ves cambiando los valores para comprobar que funciona.*/

fun main(){
    var n1 = 2
    var n2 = 1

    if(n1 >= n2){
        if(n1 == n2){
            println("$n1 es igual que $n2")
        }
        else {
            println("$n1 es mayor que $n2")
        }
    }
    else{
        println("$n2 es mayor que $n1")
    }
}
