package me.beresnev.dokka.debug

class Clazz {

}

/**
 * hello
 * <pre class=" language-kotlin"><code class=" language-kotlin">
 * artifactRules = "+:result&#47;** => result.zip"
 * </code></pre>
 * after
 **/
fun foo(): String {
    return "foo"
}

fun main() {
    println(
        """{ 
            "footerMessage": "(c) 2022 MyOrg" 
        }
        """.trimMargin()
    )
}
