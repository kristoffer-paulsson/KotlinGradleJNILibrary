package example.jni.hello

import example.jni.print.PrintLine

internal actual inline fun printLine(message: String) {
    PrintLine.printLine(message)
}