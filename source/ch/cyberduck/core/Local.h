/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class ch_cyberduck_core_Local */

#ifndef _Included_ch_cyberduck_core_Local
#define _Included_ch_cyberduck_core_Local
#ifdef __cplusplus
extern "C" {
#endif
#undef ch_cyberduck_core_Local_FILE_TYPE
#define ch_cyberduck_core_Local_FILE_TYPE 1L
#undef ch_cyberduck_core_Local_DIRECTORY_TYPE
#define ch_cyberduck_core_Local_DIRECTORY_TYPE 2L
#undef ch_cyberduck_core_Local_SYMBOLIC_LINK_TYPE
#define ch_cyberduck_core_Local_SYMBOLIC_LINK_TYPE 4L
#undef ch_cyberduck_core_Local_VOLUME_TYPE
#define ch_cyberduck_core_Local_VOLUME_TYPE 8L
/*
 * Class:     ch_cyberduck_core_Local
 * Method:    kind
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_ch_cyberduck_core_Local_kind
  (JNIEnv *, jobject, jstring);

/*
 * Class:     ch_cyberduck_core_Local
 * Method:    setQuarantine
 * Signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_ch_cyberduck_core_Local_setQuarantine
  (JNIEnv *, jobject, jstring, jstring, jstring);

/*
 * Class:     ch_cyberduck_core_Local
 * Method:    setIconFromFile
 * Signature: (Ljava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_ch_cyberduck_core_Local_setIconFromFile
  (JNIEnv *, jobject, jstring, jstring);

/*
 * Class:     ch_cyberduck_core_Local
 * Method:    removeCustomIcon
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_ch_cyberduck_core_Local_removeCustomIcon
  (JNIEnv *, jobject, jstring);

/*
 * Class:     ch_cyberduck_core_Local
 * Method:    applicationForExtension
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_ch_cyberduck_core_Local_applicationForExtension
  (JNIEnv *, jobject, jstring);

#ifdef __cplusplus
}
#endif
#endif
