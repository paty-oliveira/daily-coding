import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:
 *
 *  1. Your message is a string containing space separated words.
 *  2.You need to encrypt each word in the message using the following rules:
 *  3.The first letter must be converted to its ASCII code.
 *  4. The second letter must be switched with the last letter
 *
 * Keepin' it simple: There are no special characters in the input.
 *
 * Example:
 * Kata.encryptThis("Hello") => "72olle"
 * Kata.encryptThis("good") => "103doo"
 * Kata.encryptThis("hello world") => "104olle 119drlo"
 *
 */

public class Encryption {

    public String encrypt(String message) {
        return  message.isEmpty() ? "" :
                Stream.of(message.split(" "))
                        .map(Encryption::applyEncryption)
                        .collect(Collectors.joining(" "));
    }

    private static String applyEncryption(String word){
        return String.valueOf((int) word.charAt(0))
                + word.charAt(word.length() - 1)
                + word.substring(2, word.length() - 1)
                + word.charAt(1);
    }
}
