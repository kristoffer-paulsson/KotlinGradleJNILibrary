package example.interop

// !IMPORTANT!
// Expect class that requires each platform to implement actual classes.
internal expect class PrintLine {
    companion object{
        fun print(message: String)
    }
}