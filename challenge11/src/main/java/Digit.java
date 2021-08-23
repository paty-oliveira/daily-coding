/**
 * Digital root is the recursive sum of all the digits in a number.
 *
 * Given n, take the sum of the digits of n. If that value has more than one digit,
 * continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
 *
 * Examples
 *     16  -->  1 + 6 = 7
 *    942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 */


public class Digit {
    public int calculateDigitalRoot(int number) {
        while (number > 9){
            number = sumOfDigit(number);
        }
        return number;
    }

    private int sumOfDigit(int number) {
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
