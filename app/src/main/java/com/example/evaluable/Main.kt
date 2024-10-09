package com.example.evaluable
import kotlin.math.absoluteValue
import kotlin.math.pow
import kotlin.math.sqrt

fun ecuacionSegundoGrado (a : Double, b : Double, c :Double) :DoubleArray {
    val discriminante = b.pow(2) - (4*a*c)
    if (discriminante > 0){
        val x1 = (-b + sqrt(discriminante) /2*a)
        val x2 = (-b - sqrt(discriminante) /2*a)
        val arr = DoubleArray(3)
        arr[0] = 1.0
        arr[1] = x1
        arr[2] = x2
        return arr
    }
    else if (discriminante == 0.0) {
        val x1 = -b/2*a
        val arr = DoubleArray(3)
        arr[0] = 2.0
        arr[1] = x1
        arr[2] = 0.0
        return arr
    }
    else
        return DoubleArray(3) {0.0}
}
fun f1 (a : Double, b : Double, c :Double) : Double?{
    val myArr : DoubleArray = ecuacionSegundoGrado(a, b, c)
    when (myArr[0]) {
        1.0 ->
            return myArr[1].absoluteValue + myArr[2].absoluteValue
        2.0 ->
            return myArr[1]
        0.0 ->
            return 0.0
    }
    return null
}

fun main(){
    println(f1(1.0, 3.0, 2.0)) //dos soluciones
    println(f1(5.0, 3.0, 4.0)) //sin solucion
    println(f1(1.0, 2.0, 1.0)) //una solucion

}

