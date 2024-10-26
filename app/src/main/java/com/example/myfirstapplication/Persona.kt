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

open class Estudiante(override var nombre: String, var grado: String): Persona(nombre) {
    init { println("Iniciando la clase derivada") }

    final override fun saludar() {
        // super hace referencia a la clase padre
        super.saludar()
        println("y estoy en $grado")
    }
}

class Oyente: Estudiante("", "") {
//    no se puede sobrescribir por que esta marcado como final
//    override fun saludar() {
//        println("Soy un oyente")
//    }
}
