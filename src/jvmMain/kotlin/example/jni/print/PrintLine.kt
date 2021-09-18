package example.jni.print

class PrintLine {
    companion object{
        init {
            System.loadLibrary("print_line")
        }

        @JvmStatic
        external fun printLine(message: String)
    }
}