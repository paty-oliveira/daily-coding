import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible,
 * containing distinct letters - each taken only once - coming from s1 or s2.
 *
 * Example:
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"
 * longest(a, b) -> "abcdefklmopqwxy"
 *
 * a = "abcdefghijklmnopqrstuvwxyz"
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */

class LettersConvertor {

    public String distinctLetters(String inputLetters1, String inputLetters2) {
        String distinctLetters = inputLetters1 + inputLetters2;

        return Arrays.stream(distinctLetters.split(""))
                .distinct()
                .sorted()
                .collect(Collectors.joining());
    }
}
