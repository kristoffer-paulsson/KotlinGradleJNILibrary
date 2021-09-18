import example.jni.hello.HelloWorld
import org.junit.Test

class HelloWorldTest {

    @Test
    fun helloWorld() {
        HelloWorld.helloWorld("JNI developer")
    }
}