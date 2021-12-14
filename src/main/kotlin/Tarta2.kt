import java.lang.NumberFormatException

fun imprimirVelas2(edad: Int) {
    println()
    repeat(edad) {
        print("\'")
    }
    println()
    repeat(edad) { print('|') }
    println()
}

fun imprimirCapaSup2(edad: Int) {
    repeat(edad) { print('=') }
    println()

}

fun imprimirCapaInf2(edad: Int, capas: Int) {
    repeat(capas) { repeat(edad) { print('@') }; println() }
}

fun bucleMensaje2(edad: Int) {
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
fun mensaje2(edad: Int, mensaje:String) {
    bucleMensaje(edad)
    println()
    repeat((edad/2)-(mensaje.length/2)){ print(' ')}
    println(mensaje)
    bucleMensaje(edad)
}

fun main() {
    var mensajeIntroducido:String = ""
    var edadintroducida: Int = 0
    var capasIntroducidas = 0
    try {
        println("Introduzca la edad")
        edadintroducida = readLine()!!.toInt()
        println("Numero de capas")
        capasIntroducidas = readLine()!!.toInt()
        println("Mensaje de feliicitacion")
        mensajeIntroducido = readLine().toString().uppercase()
    } catch (e: NumberFormatException) {
        println("error de formato vuelva a intentarlo")

    }
    mensaje(edadintroducida, mensajeIntroducido)
    println()
    imprimirVelas(edadintroducida)
    imprimirCapaSup(edadintroducida)
    imprimirCapaInf(edadintroducida, capasIntroducidas)
    mensaje(edadintroducida, mensajeIntroducido)


}