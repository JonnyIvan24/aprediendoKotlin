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
//    enteros()
//    arreglos()
    coleciones()
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

    // operaciones de bit a bit
    val primero = 0b1010
    val segundo = 0b1100

    println(primero and segundo) // 0b1000
    println(primero or segundo) // 0b1110
    println(primero xor segundo) // 0b0110

    println(0b0011 shl 0b0001) // 0110

    // Rangos
    val miRango = 1..10 step 2
    println(2 in miRango) // false

    var miNumero = 1
    miNumero /= 1
    println(miNumero)

    // enteros sin signo
    val a2 = 10u
    println(a2 - 11u)

    // caracter
    val miCaracter = '1'
    val miNumero1 = miCaracter.digitToInt()
}


fun arreglos() {
    val miArray = arrayOf(1, 2, 3)
    println(miArray.contentToString())

    val miArray2 = arrayOfNulls<String>(2)

    var miArreglo3 = emptyArray<Int>()
    miArreglo3 = arrayOf(2, 3, 5)

    miArreglo3[2] = 6
    println(miArreglo3.contentEquals(miArray))
    println(miArreglo3.sum())

    miArray[1] = 1
    println(miArray.toList())

    val persona:  Pair<String, Int> = Pair("Alicia", 30)

    println("el nombre de la persona es ${persona.first}")
    println("la edad de la persona es ${persona.second}")

    val personas: Array<Pair<String, Int>> = arrayOf(persona, "Juan" to 50, "Ana" to 20)
    println(personas.contentToString())
    println(personas.toMap())
}

fun coleciones() {
    val numerosInmutables = listOf(1, 2 ,3)
    val numerosMutables = mutableListOf(1, 2 ,3)

//    numerosInmutables[3] = 4 // nos da error por que no permite la edición
//    numerosInmutables.add(4) // no existe el método ya que es inmutable
//    numerosMutables[3] = 4
    numerosMutables.add(4)


    println(numerosInmutables)
    println(numerosMutables)

    // Maps

    val mutableMap: MutableMap<String, Int> = mutableMapOf("Alicia" to 30, "Bob" to 25)

    mutableMap["Alicia"] = 20

    println(mutableMap["Alicia"])

    // ArrayDeque

    val deque = ArrayDeque(listOf(1, 2, 3))
    println(deque)
}
