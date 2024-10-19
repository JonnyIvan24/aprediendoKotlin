package com.example.myfirstapplication

import kotlinx.coroutines.delay

suspend fun longRunningTask(): String {
    delay(5000)
    return "Tarea completada"
}
