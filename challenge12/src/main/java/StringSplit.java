import java.util.Arrays;
import java.util.List;

/**
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then it should replace the missing second character
 * of the final pair with an underscore ('_').
 *
 * Examples:
 *
 * StringSplit.solution("abc") // should return {"ab", "c_"}
 * StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
 */

public class StringSplit {
    public String[] apply(String characters) {
        String[] charsChunk = characters.split("(?<=\\G.{2})");

        if (characters.length() % 2 != 0) {
            int lastElementIndex = charsChunk.length - 1;
            String newElement = charsChunk[lastElementIndex] + "_";
            charsChunk[lastElementIndex] = newElement;
        }
        return charsChunk;
    }
}
