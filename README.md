# KotlinGradleJNILibrary

This is an example implementation of classes that may be interoperable both with Kotlin/Native and Kotlin/JVM via Java Native Interface. 
As recommended all-important implementations are done in Kotlin/Common, then the interoperability is implemented in the other platforms.

Technically the method `print` is implemented platform specifically for demonstration purposes, which means that `println` is not used.

The important files to study and understand are:
* `settings.gradle.kts`
* `build.gradle.kts`
* `src/commonMain/kotlin/example/hello/HelloWorld.kt`
* `src/commonMain/kotlin/example/interop/PrintLine.kt`
* `src/nativeMain/kotlin/example/interop/PrintLine.kt`
* `src/jvmMain/kotlin/example/interop/PrintLine.kt`
* `src/jvmTest/kotlin/example/hello/HelloWorldTest.kt`
* `print_line/build.gradle.kts`
* `print_line/src/main/cpp/example_interop_PrintLineImpl.cpp`

The above files are key to make an interoperable implementation work, both to add a subproject for Java JNI and to make all platforms available in a neat way.
