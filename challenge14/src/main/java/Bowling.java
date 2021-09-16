import java.util.Map;

/**
 * Did you ever play Bowling? Short: You have to throw a bowl into 10 Pins arranged like this:
 *
 * I I I I  # each Pin has a Number:    7 8 9 10
 *  I I I                                4 5 6
 *   I I                                  2 3
 *    I                                    1
 *
 * You will get an Array with Numbers, e.g.: [3,5,9] and remove them from the field like this:
 *
 *
 * I I   I
 *  I   I
 *   I
 *    I
 *
 * Return a string with the current field.
 *
 * Note that:
 * Each Line must be 7 chars long
 * Fill the missing pins with a whitespace
 */

public class Bowling {

    StringBuilder game = new StringBuilder("I I I I" +
                                           " I I I " +
                                           "  I I  " +
                                           "   I   ");

    Map<Integer, Integer> pinsMapping = Map.of(
            1, 24,
            2, 16,
            3, 18,
            4, 8,
            5, 10,
            6, 12,
            7, 0,
            8, 2,
            9, 4,
            10, 6
    );

    public String knockPin(int[] knockedPins) {
        for (int pin: knockedPins){
            int index = pinsMapping.get(pin);
            game.setCharAt(index, ' ');
        }
        return game.toString();
    }
}
