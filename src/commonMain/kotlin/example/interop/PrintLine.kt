package example.interop

internal expect class PrintLine {
    companion object{
        fun print(message: String)
    }
}