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

    // strings()
    enteros()
}

fun strings() {
    val miTexto = "hola mundo"
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

fun enteros() {
    val myByte: Byte = 123
    val miEntero: Int = myByte.toInt()
    // println(myByte == miEntero) // no podemos comparar diferentes tipos de valores

    // para declarar una flotante como un long es necesario especificar el tipo en el valor
    val miFlotante = 1.5F
    println(miFlotante)

    val b: Float

    // oparedores aritmeticos

    val x = 5 / 2 // una división de enteros siempre retorna un entero
    println(x == 2)

    val y = 5.toDouble() / 2 // si uno de los valores es de tipo flotante se retorna ese mismo tipo
    println(y == 2.5)

    // constantes literales
    val cienMil = 100_000
    println(cienMil)
    val miHexa = 0xF
    println(miHexa + 10)

    println(12.5e10) // 0.000000125
}
