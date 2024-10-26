package com.example.myfirstapplication

interface Impresora {
    fun imprimir(documento: String) : String
}

class ImpresoraReal: Impresora {
    override fun imprimir(documento: String): String {
        return "Imprimiendo $documento"
    }
}

class Computadora(val impresora: Impresora): Impresora by impresora
