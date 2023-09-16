package com.utec.foro

fun main() {
    print("Ingrese una cadena de caracteres: ")
    val input = readLine()

    if (input != null) {
        // Si no está vacío, inicializo variable para contar las vocales
        var contadorVocales = 0

        // Acá comienzo a recorrer la cadena caracter por caracter
        for (caracter in input) {
            // La forma que utilizo yo para que sea insensible a mayúsculas y minúsculas,
            // es cambiando todo los caracteres a minusculas con .lowercaseChar()
            val caracterMinusc = caracter.lowercaseChar()

            // Con este if verifico si es una vocal y si lo fuera
            // la suma a la variable ('a', 'e', 'i', 'o', 'u')
            if (caracterMinusc == 'a' || caracterMinusc == 'e' || caracterMinusc == 'i' || caracterMinusc == 'o' || caracterMinusc == 'u') {
                contadorVocales++
            }
        }

        // Mostrar el número total de vocales encontradas
        println("El número total de vocales encontradas es: $contadorVocales")
    } else {
        println("Entrada inválida. Por favor, ingrese una cadena de caracteres.")
    }
}
