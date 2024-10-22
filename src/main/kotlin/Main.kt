package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var opcion: Int? = null

    while (opcion != 0) {

        println("Menú:")
        println("1. Ejercicio 1")
        println("2. Ejercicio 2")
        println("3. Ejercicio 3")
        println("4. Ejercicio 4")
        println("5. Ejercicio 5")
        println("6. Ejercicio 6")
        println("7. Ejercicio 7")
        println("8. Ejercicio 8")
        println("9. Ejercicio 9")
        println("10. Ejercicio 10")
        println("0. Salir")

        print("Elige una opción: ")

        opcion = readLine()?.toIntOrNull()

        when (opcion) {

            1 -> {
                println("Ejecutando el Ejercicio 1...")
                Ejercicio1()
            }

            2 -> {
                println("Ejecutando el Ejercicio 2...")
                Ejercicio2()
            }

            3 -> {
                println("Ejecutando el Ejercicio 3...")
                Ejercicio3()
            }

            4 -> {
                println("Ejecutando el Ejercicio 4...")
                Ejercicio4()
            }

            5 -> {
                println("Ejecutando el Ejercicio 5...")
                Ejercicio5()
            }

            6 -> {
                println("Ejecutando el Ejercicio 6...")
                Ejercicio6()
            }

            7 -> {
                println("Ejecutando el Ejercicio 7...")
                Ejercicio7()
            }

            8 -> {
                println("Ejecutando el Ejercicio 8...")
                Ejercicio8()
            }

            9 -> {
                println("Ejecutando el Ejercicio 9...")
                Ejercicio9()
            }

            10 -> {
                println("Ejecutando el Ejercicio 10...")
                Ejercicio10()
            }

            0 -> println("Saliendo")

            else -> println("Elije una opción válida")
        }
    }
}



fun Ejercicio1() {
    println("Hola Mundo")
}

fun Ejercicio2() {
    val vida = 100
    println("La vida del personaje es $vida")
}

fun Ejercicio3() {
    val dañoPorAtaque = 5
    val cantidadAtaques = 10
    val dañoTotal = dañoPorAtaque * 5 * cantidadAtaques
    println("El daño total es $dañoTotal")
}

fun Ejercicio4() {
    var monedas = 0

    for (i in 1..10) {
        monedas += 5
        println("Paso $i: Tienes $monedas monedas")
    }
}

fun Ejercicio5() {

    print("Ingresa el nivel del personaje: ")
    val nivel = readLine()?.toIntOrNull()

    if (nivel != null) {
        when {
            nivel < 10 -> println("Personaje principiante")
            nivel in 10..20 -> println("Personaje intermedio")
            nivel > 20 -> println("Personaje avanzado")
            else -> println("Nivel no válido")
        }
    } else {
        println("Entrada no válida. Por favor ingresa un número.")
    }
}

fun Ejercicio6(): Int {
    val dmg: Int = 50
    return if (dmg > 50) {
        println("¡Golpe crítico!")
        dmg * 2
    } else {
        dmg
    }
}


fun Ejercicio7() {

    val name = "Batman"
    val name2 = "Joker"

    val batmanhpMax = 100
    val jokerhpMax = 100
    val BatmanDmg = 33
    val villanoDamage = 15

    var batmanhp = batmanhpMax
    var jokerHp = jokerhpMax

    while (batmanhp > 0 && jokerHp > 0) {


        // Batman ataca al Joker
        jokerHp -= BatmanDmg
        if (jokerHp < 0) jokerHp = 0
        println("$name ataca a $name2 causando $BatmanDmg de daño. Vida de $name2: $jokerHp")

        // Verificar si el Villano ha caído
        if (jokerHp == 0) {
            println("$name ha ganado la batalla!")
            break
        }

        // Villano ataca al Héroe
        batmanhp -= villanoDamage
        if (batmanhp < 0) batmanhp = 0
        println("$name2 ataca a $name causando $villanoDamage de daño. Vida de $name: $batmanhp")

        // Verificar si el Héroe ha caído
        if (batmanhp == 0) {
            println("$name2 ha ganado la batalla!")
        }
    }
}

fun Ejercicio8() {

    val inventario = mutableListOf<String>() // Lista mutable para el inventario
    var opcion: Int? = null

    while (opcion != 0) {
        println("Menú de Inventario:")
        println("1. Agregar objeto")
        println("2. Eliminar objeto")
        println("3. Mostrar objetos")
        println("0. Volver al menú principal")
        print("Elige una opción: ")

        opcion = readLine()?.toIntOrNull()

        when (opcion) {
            1 -> {
                print("Ingresa el nombre del objeto a agregar: ")
                val objeto = readLine()
                if (!objeto.isNullOrEmpty()) {
                    inventario.add(objeto)
                    println("Añadido: $objeto")
                } else {
                    println("Por favor, proporciona un objeto para agregar.")
                }
            }

            2 -> {
                print("Ingresa el nombre del objeto a eliminar: ")
                val objeto = readLine()
                if (objeto != null && inventario.remove(objeto)) {
                    println("Eliminado: $objeto")
                } else {
                    println("El objeto no se encontró en el inventario.")
                }
            }

            3 -> {
                if (inventario.isEmpty()) {
                    println("El inventario está vacío.")
                } else {
                    println("Objetos en el inventario: ${inventario.joinToString(", ")}")
                }
            }

            0 -> println("Volviendo al menú principal...")
            else -> println("Opción no válida. Usa 1, 2, 3 o 0.")
        }
    }
}

fun Ejercicio9() {
    val nombrePersonaje = "Héroe"
    var experiencia = 0
    var nivel = 1

    // Simulamos ganar batallas
    for (i in 1..5) { // Simulamos 5 batallas
        println("Batalla $i ganada!")
        experiencia += 50
        println("Experiencia actual: $experiencia")

        // Verificamos si el personaje sube de nivel
        if (experiencia >= 200) {
            nivel++
            experiencia -= 200
            println("$nombrePersonaje ha subido al nivel $nivel!")
        }
    }

    println("$nombrePersonaje tiene $experiencia puntos de experiencia y está en el nivel $nivel.")
}

fun Ejercicio10() {
    val vidaEnemigo = 500
    val equipo = listOf(30, 45, 25, 60)
    var vidaRestante = vidaEnemigo

    while (vidaRestante > 0) {
        val dañoTotal = equipo.sum()
        vidaRestante -= dañoTotal
        println("El equipo ataca, causando un daño total de $dañoTotal. Vida restante del enemigo: $vidaRestante")
    }

    println("El enemigo ha sido derrotado!")
}