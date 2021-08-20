import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Complete the function that accepts a string parameter, and reverses each word in the string.
 * All spaces in the string should be retained.
 *
 * Example:
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 */

public class Word {

    public String toReverse(String wordInput) {
        return Arrays.stream(wordInput.split("\\s"))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }
}


