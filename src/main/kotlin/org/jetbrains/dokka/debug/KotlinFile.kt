package org.jetbrains.dokka.debug

/**
 * This is my Kotlin class
 */
class KotlinClass {

    /**
     * This is my Kotlin function
     *
     * @return nothing.
     */
    fun kotlinFunction() {}
}

/**
 * This is my Kotlin extension function.
 *
 * @return the meaning of life
 */
fun KotlinClass.extensionFunction(): Int {
    return 42
}
