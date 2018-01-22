package io.acari.intro;

public class VarNameChecker {

    /**
     * Correct variable names consist only of Latin letters,
     * digits and underscores and they can't start with a digit.
     *
     * @param name
     * @return
     */
    boolean variableName(String name) {
        return name.matches("^(_|[a-zA-Z])(([a-zA-Z0-9]|_)?)+");
    }

}
