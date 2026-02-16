package com.pjasoft.lib

/* 1. Crea un programa que tenga un precio de comida y un porcentaje de comida e impromor cuanto es el total a pagar */
// String interpolation

// ¿Qué es un hilo? Kotlin es null safty
fun main(){
//    println("Hola mundo")
//
//    val price: Double = 150.0
//    val percentage: Double = 0.10
//    val tip: Double = price * percentage
//    val total : Double = price + tip
//    println("El costo de la comida es: $$total")
//
    // El portero de la discoteca. Verifica que una persona pueda entrar en la disco. Sólo entran mayores de edad.
    println("Escribe tu edad")
    val input = readlnOrNull()
    val age = input?.toIntOrNull()
    /* if(age == null){
        println("El número que pusiste no es un número entero.")
    }
    else if(age > 18){
        println("Eres mayor de edad, pásale a la discoteca.")
    }
    else{
        println("No puedes pasar pai")
    }
    println("La edad es: $age") */
    when(age){
        null -> println("El número que pusiste no es un número entero.")
        in 18..Integer.MAX_VALUE -> println("Eres mayor de edad, pásale a la discoteca")
        else -> println("No puedes pasar pai")
    }

    var counter : Int = 12
    while(counter < 20){
        println("El contador es menor que 20")
        counter ++
    }

    // DO WHILE -> Ejecuta primero el bloque de código y después evalúa la condición
    do{
        println("El contador vale menos que 30")
        counter++
    }
        while(counter < 30)
//    for(i in 1..10){
//        println(i)
//    }
//
//    // Ciclo for al revés
//    for(i in 10 downTo 2){
//        println(i)
//    }
//
//    for(i in 100 downTo 0 step 10){
//        println(i)
//    }
        // Determinar si un número ingresado por el usuario es primo o no primo
        println("Ingrese un número")
    val inputprimos = readlnOrNull()
    val numero = input?.toIntOrNull()

    // Cambio interesante
    // Cambio pendiente
    // CAMBIO QUE SE ME OLVIDÓ POR TONTO
    // ÚTLIMO CAMBIO ESTOY BIEN WEY AYUDA
}