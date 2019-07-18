
fun getGreeting(): String {
    return "Hello Kotlin"
}

fun sayHello(): Unit {
    println(getGreeting())
}

fun sayHello(itemToGreet:String){
    val msg = "Hello " + itemToGreet
    println(msg)
}


fun main() {
    println("Hello World")
    println(getGreeting())
    sayHello()
    sayHello("Kotlin")
}
