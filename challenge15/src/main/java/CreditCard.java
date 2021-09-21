
import java.util.ArrayList;
import java.util.List;

/**
 * In this Kata, you will implement the Luhn Algorithm, which is used to help validate credit card numbers.
 *
 * Given a positive integer of up to 16 digits, return true if it is a valid credit card number,
 * and false if it is not.
 *
 * Here is the algorithm:
 *
 * Double every other digit, scanning from right to left, starting from the second digit (from the right).
 *
 * Another way to think about it is: if there are an even number of digits, double every other digit starting
 * with the first; if there are an odd number of digits, double every other digit starting with the second:
 *
 * 1714 ==> [1*, 7, 1*, 4] ==> [2, 7, 2, 4]
 *
 * 12345 ==> [1, 2*, 3, 4*, 5] ==> [1, 4, 3, 8, 5]
 *
 * 891 ==> [8, 9*, 1] ==> [8, 18, 1]
 * If a resulting number is greater than 9, replace it with the sum of its own digits
 * (which is the same as subtracting 9 from it):
 *
 * [8, 18*, 1] ==> [8, (1+8), 1] ==> [8, 9, 1]
 *
 * or:
 *
 * [8, 18*, 1] ==> [8, (18-9), 1] ==> [8, 9, 1]
 * Sum all of the final digits:
 *
 * [8, 9, 1] ==> 8 + 9 + 1 = 18
 * Finally, take that sum and divide it by 10. If the remainder equals zero, the original credit card number is valid.
 *
 * 18 (modulus) 10 ==> 8 , which is not equal to 0, so this is not a valid credit card
 */


public class CreditCard {

    public List<Integer> parseCreditCardNumbers(String creditCardNumber){
        List<Integer> numbers = new ArrayList<>();
        for (char number: creditCardNumber.toCharArray()){
            numbers.add(Integer.parseInt(String.valueOf(number)));
        }
        return numbers;
    }

    public List<Integer> doubleCreditCardNumbers(List<Integer> creditCardNumbers, int index) {
        List<Integer> doubledNumbers = new ArrayList<>();
        for (int i = 1; i < creditCardNumbers.size(); i = i + index) {
            doubledNumbers.add(creditCardNumbers.get(i) * 2);
        }
        return doubledNumbers;
    }

    public int sumCreditCardNumbers(List<Integer> creditCardNumbers){
        return creditCardNumbers.stream().mapToInt(n -> n).sum();
    }


    public Boolean validate(String creditCardNumber) {
        if (creditCardNumber.isEmpty())
            return false;

        List<Integer> creditCardNumbers = parseCreditCardNumbers(creditCardNumber);
        int sumAllNumbers = 0;

        if (creditCardNumber.length() % 3 == 0){
            List<Integer> doubleNumbers = doubleCreditCardNumbers(creditCardNumbers, 2);
            sumAllNumbers = sumCreditCardNumbers(doubleNumbers);
        }
        else {
            List<Integer> doubleNumbers = doubleCreditCardNumbers(creditCardNumbers, 1);
            sumAllNumbers = sumCreditCardNumbers(doubleNumbers);

        }
        return sumAllNumbers % 10 == 0;
    }
}



