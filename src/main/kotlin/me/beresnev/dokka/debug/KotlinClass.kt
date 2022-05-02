package me.beresnev.dokka.debug

class KotlinClass(val s: String) {


    @Deprecated("Should be visible")
    fun deprecatedUsual() {

    }

    @Deprecated("Should not be visible", level = DeprecationLevel.HIDDEN)
    fun deprecatedHidden() {

    }
}
