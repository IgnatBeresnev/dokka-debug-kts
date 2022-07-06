package me.beresnev.dokka.debug;

public class Library {
    /**
     * This causes a ClassCastException by Dokka
     */
    @SimpleAnnotation(clazz = String[].class)
    public boolean simpleAnnotation() {
        return false;
    }

    public String[] foo() {
        return null;
    }
}
