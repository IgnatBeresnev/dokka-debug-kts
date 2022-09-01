package me.beresnev.dokka.debug

enum class KotlinEnum {
    FOO, BAR;
}

fun foo() {
    MyInterface.create()
}

interface MyInterface {

    companion object {
        @JvmStatic
        fun create(): MyInterface = MyInterfaceImpl()
    }
}

class MyInterfaceImpl() : MyInterface
