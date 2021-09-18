package example.jni.print;

public abstract class PrintLine {
    static {
        System.loadLibrary("print_line");
    }

    public static native void printLine(String message);
}