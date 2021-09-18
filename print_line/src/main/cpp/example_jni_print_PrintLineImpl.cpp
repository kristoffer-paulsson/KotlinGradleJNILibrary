#include <stdio.h>
#include "../public/example_jni_print_PrintLine.h"

#ifndef _Included_example_jni_print_PrintLine
#define _Included_example_jni_print_PrintLine
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     example_jni_print_PrintLine
 * Method:    printLine
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_example_jni_print_PrintLine_printLine(JNIEnv * env, jclass thisClass, jstring message){
    printf()
}

#ifdef __cplusplus
}
#endif
#endif
