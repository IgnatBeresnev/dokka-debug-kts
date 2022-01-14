package me.beresnev.dokka.debug.indent

import java.util.concurrent.ConcurrentMap

data class DataClassWith<T>(
    val simpleString: String,
    val simpleInt: Int,
    val typed: T,
    val xd: XD,
    val func: (Int) -> String,
    val funcDefault: (Int) -> String = { _ -> "test" },
    val genericsNestedMap: Map<String, Map<String, List<T>>>,
    val genericsNestedMapDefault: Map<String, Map<String, List<T>>> = HashMap(),
)


data class DataClassWithout<T>(
    val funcDefault: (Int) -> String = { _ -> "test" },
    val genericsNestedMapDefault: Map<String, Map<String, List<T>>> = HashMap(),
)

class SimpleClassWith<T : Number>(
    val simpleString: String,
    val typed: T,
    val simpleInt: Int,
    val xd: XD,
    val func: (Int) -> String,
    val funcDefault: (Int) -> String = { _ -> "test" },
    val genericsNestedMap: Map<String, Map<String, List<T>>>,
    val genericsNestedMapDefault: Map<String, Map<String, List<T>>> = HashMap(),
)

class SimpleClassWithout<T>(
    val funcDefault: (Int) -> String = { _ -> "test" },
    val genericsNestedMapDefault: Map<String, Map<String, List<T>>> = HashMap(),
)

fun <T> simpleFunctionWith(
    simpleString: String,
    typed: T,
    simpleInt: Int,
    xd: XD,
    func: (Int) -> String,
    funcDefault: (Int) -> String = { _ -> "test" },
    genericsNestedMap: Map<String, Map<String, List<T>>>,
    genericsNestedMapDefault: Map<String, Map<String, List<T>>> = HashMap(),
): String = "s"

fun <T> simpleFunctionWithout(
    funcDefault: (Int) -> String = { _ -> "test" },
    genericsNestedMapDefault: Map<String, Map<String, List<T>>> = HashMap(),
): String = "s"

fun simpleFunctionParameterless(): String = "true"

@Target(AnnotationTarget.CLASS)
@Retention(value = AnnotationRetention.RUNTIME)
annotation class AnnotationWith(
    val simpleString: String,
    val stringAgain: String,
    val simpleInt: Int,
    val simpleIntAgain: Int,
    val simpleIntThird: Int,
)

@Target(AnnotationTarget.CLASS)
@Retention(value = AnnotationRetention.RUNTIME)
annotation class AnnotationWithout(
    val xd1: String,
    val xd2: String
)

@AnnotationWith(
    simpleString = "s",
    stringAgain = "s",
    simpleInt = 42,
    simpleIntAgain = 42,
    simpleIntThird = 42
)

@AnnotationWithout(xd1 = "XD", xd2 = "XD")
class AnnotationApply {

}

enum class EnumWith(
    val simpleString: String,
    val simpleInt: Int,
    val xd: XD,
    val func: (Int) -> String,
    val funcDefault: (Int) -> String = { _ -> "test" },
    val genericsNestedMap: Map<String, Map<String, List<String>>>,
    val genericsNestedMapDefault: Map<String, Map<String, List<String>>> = HashMap(),
) {
    ONE(
        simpleString = "s",
        simpleInt = 42,
        xd = HashMap(),
        func = { _ -> "test" },
        genericsNestedMap = HashMap()
    ),
    TWO(
        simpleString = "s",
        simpleInt = 42,
        xd = HashMap(),
        func = { _ -> "test" },
        genericsNestedMap = HashMap()
    ),
    THREE(
        simpleString = "s",
        simpleInt = 42,
        xd = HashMap(),
        func = { _ -> "test" },
        genericsNestedMap = HashMap()
    ),
    FOUR(
        simpleString = "s",
        simpleInt = 42,
        xd = HashMap(),
        func = { _ -> "test" },
        genericsNestedMap = HashMap()
    )
}

enum class EnumWithout(
    val funcDefault: (Int) -> String = { _ -> "test" },
    val genericsNestedMapDefault: Map<String, Map<String, List<String>>> = HashMap(),
) {
    ASD(), JFJDSKF(), JKFJDSF(), HJDJSF()
}

fun <T> ConcurrentMap<String, String>.extensionWith(
    simpleString: String,
    simpleInt: Int,
    xd: XD,
    func: (Int) -> String,
    funcDefault: (Int) -> String = { _ -> "test" },
    genericsNestedMap: Map<String, Map<String, List<String>>>,
    genericsNestedMapDefault: Map<String, Map<String, List<String>>> = HashMap(),
): String {
    return ""
}

fun <T> ConcurrentMap<String, String>.extensionWithout(
    funcDefault: (Int) -> String = { _ -> "test" },
    genericsNestedMapDefault: Map<String, Map<String, List<T>>> = HashMap(),
): String {
    return ""
}

typealias XD = Map<String, String>

class SimpleClassWithoutButWithGenerics<T : Number, R : CharSequence> : Comparable<T>, Collection<R> {

    override val size: Int
        get() = 10

    override fun compareTo(other: T): Int {
        TODO("Not yet implemented")
    }

    override fun contains(element: R): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<R>): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<R> {
        TODO("Not yet implemented")
    }
}