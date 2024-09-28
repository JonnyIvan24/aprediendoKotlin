package com.example.myfirstapplication

fun main() {
    var miTexto = "hola mundo"
    miTexto = "hola"

    val miTextoInmutable = "ya no se cambia este valor"

    println(miTexto)

    val clientes = 10

    // String templates
    println("tengo ${clientes} clientes")
    println("tengo ${1} clientes")

    var miTexto2: String

//    println(miTexto2) // nos da error por que no hay un valor iniciado en la variable

    // multi-línea

    val miMultilinea = """
        primera línea
        segunda línea
    """
    miTexto2 = " mundo"
    println(miMultilinea.trimIndent())
    println(miTexto.length)
    println(miTexto + miTexto2)
    var miPrimerCaracter = miTexto[0] // siempre nos dara un valor de tipo Char
//    miTexto2 = miPrimerCaracter nos da error por que no es un valor de tipo string
    miTexto2 = miPrimerCaracter.toString()
    println(miTexto[0])
    println( miTexto[miTexto.length - 1])

    // String.format acepta dos argumentos
    val numeroEntero = String.format("%07d", 31416)
    println(numeroEntero)

    val holaMundo = String.format("%S %S", "hola", "mundo")
    println(holaMundo)
}