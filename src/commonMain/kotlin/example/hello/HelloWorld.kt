package example.hello

import example.interop.PrintLine

class HelloWorld {
    companion object{
        fun helloWorld(name: String){
            PrintLine.print("Hello, ${name}!")
        }
    }
}