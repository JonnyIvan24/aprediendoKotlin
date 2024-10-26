package com.example.myfirstapplication

open class Encapsulamiento {
    internal fun saludar() {
        println("hola")
    }
    fun otroSaludo() {
        saludar()
    }
}

class OtroEncapsulamiento: Encapsulamiento() {
    fun intentoSaludar() {
        super.saludar()
    }
}
