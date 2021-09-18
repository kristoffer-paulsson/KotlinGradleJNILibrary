package example.jni.hello

class HelloWorld {
    companion object{
        fun helloWorld(name: String){
            printLine("Hello, ${name}!")
        }
    }
}

internal expect inline fun printLine(message: String)