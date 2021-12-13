import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Your task is to sort a given string. Each word in the string will contain a single number.
 *
 * This number is the position the word should have in the result.
 *
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 *
 * If the input string is empty, return an empty string.
 * The words in the input String will only contain valid consecutive numbers.
 *
 */

public class Order {

    public String sortByNumber(String words) {
        return Arrays
                .stream(words.split("\\s+"))
                .sorted(Comparator.comparing(Order::extractInt))
                .collect(Collectors.joining(" "));
    }

    static int extractInt(String word){
        String numbers = word.replaceAll("[^\\d.]", "");
        return numbers.isEmpty() ? 0 : Integer.parseInt(numbers);
    }
}

