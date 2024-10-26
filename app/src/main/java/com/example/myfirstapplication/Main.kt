package com.example.myfirstapplication

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.DayOfWeek
import java.time.LocalDate
import kotlinx.coroutines.*

@RequiresApi(Build.VERSION_CODES.O)
fun main() = runBlocking {
    var miTexto = "hola mundo"
    miTexto = "hola"

    val miTextoInmutable = "ya no se cambia este valor"

    println(miTexto)

    val clientes = 10

    // String templates
    println("tengo ${clientes} clientes")
    println("tengo ${1} clientes")

    println("")
    println("")
    println("")

    // strings()
//    enteros()
//    arreglos()
//    coleciones()

//    condicionales()
//    bucles()

//    nullSafety()
//    funciones()

//    println("iniciando tarea..." )
//    val resultado = async { longRunningTask() }


//    println("Haciendo otras cosas..." )

//    println("Resultado de la tarea: ${resultado.await()}" )

//    clases()
    patrones()
}

fun patrones() {
    val motor = Motor()
    val coche = Coche(motor)

    println(coche.arrancar())

    val impresora = ImpresoraReal()
    val computadora = Computadora(impresora)
    println(computadora.imprimir("documento.pdf"))
}

const val CODIGO_DEPRECADO = "Este código esta deprecado"

@Deprecated(CODIGO_DEPRECADO, ReplaceWith("utiliza otra función")) fun metodoDeprecado() {
    println("metodo deprecado")
}

fun clases() {
    val persona = Persona("Ana")
//    println(persona.nombre)
//    persona.apellido = "Rosas"
//    println(persona.apellido)
//    persona.saludar()

    val estudiante = Estudiante("Pedro", "Primero")
    estudiante.nombre = "Juan"
    estudiante.saludar()
}

fun funciones() {
    println(division(2, 5))

    println(calcularPromedio(listOf(5, 10, 10)))

    println(crearLista(1, 3, 5, 6))

    val textoMayusculas = { texto: String -> texto.uppercase() }
    println(textoMayusculas("hola"))

    val sumaPares = { numeros: List<Int> ->
        var total = 0
        for (numero in numeros) {
            if (numero % 2 == 0) {
                total += numero
            }
        }
        total
    }

    println(sumaPares(listOf(1, 3, 2)))

    val suma: (a: Int, b: Int) -> Int = {a, b -> a + b}
    val resta: (a: Int, b: Int) -> Int = {a, b -> a - b}

    println(realizarOperacion(1, 2, suma))
    println(realizarOperacion(1, 2, resta))

    val numeros = listOf(-1, 2, 3, 4)

    var numerosPares = numeros.filter{ numero -> numero % 2 == 0 }
    numerosPares = numeros.filter{ it % 2 == 0 }

    val buscarNegativos =  fun (numero: Int): Boolean {
        return numero < 0
    }
    val negativos = numeros.filter(buscarNegativos)

    println(negativos)

    listOf(1, 2, 3, 4, 5).forEach{
        if (it == 3) {
            return@forEach
        }
        print(it)
    }

    println("")
    val numero = run ciclo@{
        listOf(1, 2, 3, 4, 5).forEach{
            if (it == 3) {
                return@ciclo it
            }
            print(it)
        }
    }
    println("")
    println(numero)
}

fun nullSafety() {
    var a:String? = null

    if (a == null) {
        // ...
    }

    var b: Int = a?.length ?: 0

    var persona: Person? = null
    println(persona.toString())

    val c: Any = "hola mundo"

    val numero: Int? = c as? Int // null
    val texto: String? = c as? String // hola mundo
}

data class Person(val name: String)

fun bucles() {
    // también se puede iterar en las coleciones
    // por ejemplo val myLista = mutableListOf(1, 2, 3, 4, 5)
    for (number in 1..5) {
        println(number)
    }

    var pastelesComidos = 0
    while (pastelesComidos < 3) {
        println("Se comio un pastel")
        pastelesComidos++
    }

    var pastelesHorneados = 0
    do {
        println("Se horneo un pastel")
        pastelesHorneados++
    } while (pastelesHorneados < pastelesComidos)
}

@RequiresApi(Build.VERSION_CODES.O)
fun condicionales() {
    val edad =  20

    if (edad < 18) {
        println("Tienes menos de 18 años")
    } else if (edad >= 18 && edad <= 40) {
        println("Tienes entre 18 y 40 años")
    } else {
        println("Tienes más de 40 años")
    }

    val diaActual = LocalDate.now()

    val texto = when (diaActual.dayOfWeek) {
        DayOfWeek.SATURDAY -> "sabado"
        DayOfWeek.SUNDAY -> {

            "domingo"
        }
        else -> "un día entre semana"
    }

    println(texto)
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
