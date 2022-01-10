package me.beresnev.dokka.debug

class ClassWithPrimaryCon constructor(val xd: Int) {

    //    @Deprecated("hey")
    constructor(xd: Int, tx: Long) : this(xd)

    fun method() {
        print(xd)
    }
}

fun JavaClassWithCons.extensionMethod(overloaded: Boolean) {

}