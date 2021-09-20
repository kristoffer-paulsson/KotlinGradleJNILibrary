package example.interop

import platform.posix.printf

internal actual class PrintLine {
    actual companion object {

        // !IMPORTANT!
        // Implements "print_line" for Kotlin/Native
        actual fun print(message: String) {
            printf(message)
        }
    }
}