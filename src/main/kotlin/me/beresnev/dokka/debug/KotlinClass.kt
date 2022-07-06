package me.beresnev.dokka.debug

class KotlinLibrary {

    @SimpleAnnotation(clazz = Array<String>::class)
    fun simpleAnnotation(): Boolean {
        return false
    }

    fun foo(): Array<String>? {
        return null
    }
}
