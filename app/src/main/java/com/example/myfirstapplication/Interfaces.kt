package com.example.myfirstapplication

interface MiInterface {
    var propiedad: Int?

    val propiedadConimplementacion: String
        get() = "Algún valor"

    fun saludar(): String

    fun saludarConImplementacion(): String {
        return ""
    }
}

class MiClase(override var propiedad: Int?) : MiInterface {
    override fun saludar(): String {
        TODO("Not yet implemented")
    }
}

class OtraClase: MiInterface {
    override var propiedad: Int? = null
        get() = field
        set(value) {}

    override fun saludar(): String {
        TODO("Not yet implemented")
    }
}

interface OtraInterface: MiInterface {
    val otraPropiedad:  String
}

class ClaseDeMultiuplesInterfaces(
    override var propiedad: Int?,
    override val otraPropiedad: String
) : OtraInterface {
    override fun saludar(): String {
        TODO("Not yet implemented")
    }
}

fun interface EsUnPar {
    fun esUnPar(numero: Int): Boolean
}
