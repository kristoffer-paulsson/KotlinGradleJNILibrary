plugins {
    kotlin("multiplatform") version "1.5.30"
}

group = "example.jni"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        testRuns["test"].executionTask.configure {
            useJUnit()
            // !IMPORTANT!
            // This system property was added to add the "print_line" build as java class path.
            systemProperty(
                "java.library.path",
                listOf(
                    file("${project(":print_line").buildDir}/lib/main/debug").absolutePath,
                ).joinToString(":") + ":" + System.getProperty("java.library.path")
            )
        }
    }
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    
    sourceSets {
        val commonMain by getting
        val jvmMain by getting
        val jvmTest by getting{
            dependencies {
                implementation("junit:junit:4.13.1")
            }
        }
    }
}

// !IMPORTANT!
// This snippet was added to make this build dependent on "print_line"
tasks.withType(AbstractCompile::class) {
    dependsOn(":print_line:assemble")
}
