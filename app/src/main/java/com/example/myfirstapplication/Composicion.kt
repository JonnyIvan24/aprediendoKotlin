package com.example.myfirstapplication

class Motor {
    fun enceder(): String = "Motor encendido"
}

class Coche(val motor: Motor) {
    fun arrancar(): String = "El" + motor.enceder()
}
