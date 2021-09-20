package example.hello

import example.interop.PrintLine

class HelloWorld {
    companion object{
        // !IMPORTANT!
        // Kotlin/Common public API
        fun helloWorld(name: String){
            PrintLine.print("Hello, ${name}!")
        }
    }
}