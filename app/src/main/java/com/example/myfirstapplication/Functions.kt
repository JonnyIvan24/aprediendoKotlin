package com.example.myfirstapplication

// Funciones de expresión única (Single-expression)
fun division(a: Int, b: Int) = a/b.toDouble()

// funciones locales
fun calcularPromedio(numeros: List<Int>): Double {
    //funciones local
    fun suma(numeros: List<Int>): Int {
        var total = 0
        for (numero in numeros) {
            total += numero
        }
        return total
    }

    if (numeros.isEmpty()) {
        return 0.0
    }

    val totalSumado = suma(numeros)
    return totalSumado / numeros.size.toDouble()
}

fun crearLista(vararg numeros: Int): List<Int> {
    val lista = ArrayList<Int>()
    for (numero in numeros)
        lista.add(numero)
    return lista
}

// ejemplo de como marcar el tipo de parametro como función
fun realizarOperacion(a: Int, b: Int, operacion: (a: Int, b: Int) -> Int ): Int {
    return operacion(a, b)
}
