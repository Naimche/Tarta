import java.lang.NumberFormatException

fun imprimirVelas(edad: Int) {
    repeat(edad) {
        print("\'")
    }
    println()
    repeat(edad) { print('|') }
    println()
}

fun imprimirCapaSup(edad: Int) {
    repeat(edad) { print('=') }
    println()

}

fun imprimirCapaInf(edad: Int, capas: Int) {
    repeat(capas) { repeat(edad) { print('@') }; println() }
}

fun bucleMensaje(edad: Int) {
    var contador = edad
    if (edad > 29) {
        while (contador > 0) {
            print('\"')
            contador -= 1
            print('-')
            contador -= 1
            print('·')
            contador -= 1
            print('_')
            contador -= 1
            print('·')
            contador -= 1
            print('\"')
            contador -= 1
        }
    } else {
        repeat(5) {
            print('\"')
            contador -= 1
            print('-')
            contador -= 1
            print('·')
            contador -= 1
            print('_')
            contador -= 1
            print('·')
            contador -= 1
            print('\"')
        }
    }
}

fun mensaje(edad: Int, mensaje: String) {
    bucleMensaje(edad)
    println()
    repeat((edad / 2) - (mensaje.length / 2)) { print(' ') }
    println(mensaje)
    bucleMensaje(edad)
}

fun main() {
    var mensajeIntroducido: String = ""
    var edad: Int = 30
    var capas = 5

    try {
        println("Mensaje de feliicitacion")
        mensajeIntroducido = readLine().toString().uppercase()
    } catch (e: NumberFormatException) {
        println("error de formato vuelva a intentarlo")

    }
    mensaje(edad, mensajeIntroducido)
    println()
    imprimirVelas(edad)
    imprimirCapaSup(edad)
    imprimirCapaInf(edad, capas)
    mensaje(edad, mensajeIntroducido)

}