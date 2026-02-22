package com.pjasoft.lib

fun main(){
    // T es para tipos genéricos
    val numbers = listOf(32, 54, 215, 902, 55, 23, 0, 2)

    // esta si es dinámica
    val dynamicNumbers = mutableListOf(68,56,17,28,94,58,73)
    dynamicNumbers.add(23)
    var maxNumber = numbers[0]
    for (number in numbers){
        if(number > maxNumber){
            maxNumber = number
        }
    }
}