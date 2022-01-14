package me.beresnev.dokka.debug;

import java.util.List;
import java.util.Map;

public class JavaIndentTest<T> {

    public JavaIndentTest(
            Map<String, Map<String, List<T>>> paramWithGenerics,
            String simpleString,
            T typed,
            int i
    ) {

    }

    public JavaIndentTest(
            Map<String, Map<String, List<T>>> paramWithGenerics,
            T typed
    ) {

    }

    public String funcWith(
            Map<String, Map<String, List<T>>> paramWithGenerics,
            String simpleString,
            T typed,
            int i
    ) {
        return "F";
    }


    public String funcWith(
            Map<String, Map<String, List<T>>> paramWithGenerics,
            T typed
    ) {
        return "S";
    }
}
