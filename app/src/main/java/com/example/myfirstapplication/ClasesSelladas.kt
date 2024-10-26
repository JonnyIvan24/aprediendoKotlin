package com.example.myfirstapplication

sealed class Resultado

class Correcto: Resultado()

class Error: Resultado()

fun manejarResultado(resultado: Resultado) {
    when (resultado) {
        is Correcto -> println("El resultado es correcto")
        is Error -> println("El resultado es error")
    }
}
