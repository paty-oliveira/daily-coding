import java.util.Arrays;

/**
 * Complete the solution so that the function will break up camel casing, using a space between words.
 *
 * Example
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 *
 */

public class Word {

    private final String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    public String splitByCamelCasing() {
        return this.letters.
                replaceAll("(.)([A-Z])", "$1 $2");
    }
}