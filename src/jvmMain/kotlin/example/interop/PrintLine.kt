package example.interop

internal actual class PrintLine {
    actual companion object {

        // !IMPORTANT!
        // Implements "print_line" for Kotlin/Jvm
        actual fun print(message: String) {
            posix_print(message)
        }

        // !IMPORTANT!
        // Loads external "print_line" shared library
        init {
            System.loadLibrary("print_line")
        }

        // !IMPORTANT!
        // The actual "print_line" from the shared kibrary
        @JvmStatic
        private external fun posix_print(message: String): Boolean
    }
}