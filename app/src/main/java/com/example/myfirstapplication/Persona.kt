package com.example.myfirstapplication

// por defecto las clases se marcan como final y no se peuden heredar
open class Persona constructor(open val nombre: String, open var apellido: String) { // : Any

    // this hace referencia así misma
    constructor(nombre: String): this(nombre, "Flores") {
        println("Hola $nombre")
    }

    init {
        println("Iniciando la clase base")
        println("primer bloque init")
    }

    init {
        println("Segundo bloque init")
    }

    open fun saludar() {
        println("Hola mi nombre es $nombre $apellido")
    }
}

interface Usuario {
    fun saludar() {
        println("Hola soy un usuario")
    }
}

open class Estudiante(override var nombre: String, var grado: String): Usuario, Persona(nombre) {
    init { println("Iniciando la clase derivada") }

    override fun saludar() {
        super<Usuario>.saludar()
        super<Persona>.saludar()
    }
}

class Oyente: Estudiante("", "") {
//    no se puede sobrescribir por que esta marcado como final
//    override fun saludar() {
//        println("Soy un oyente")
//    }
}
