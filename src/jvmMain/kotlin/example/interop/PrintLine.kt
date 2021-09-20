package example.interop

internal actual class PrintLine {
    actual companion object {

        // !IMPORTANT!
        // Implements "print_line" for Kotlin/Jvm
        actual fun print(message: String) {
            posix_print(message)
        }

        init {
            System.loadLibrary("print_line")
        }

        @JvmStatic
        private external fun posix_print(message: String)
    }
}