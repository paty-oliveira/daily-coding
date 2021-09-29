/**
 * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
 *
 * Example
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 * The returned format must be correct in order to complete this challenge.
 * Don't forget the space after the closing parentheses!
 */


public class PhoneNumber {

    public StringBuilder appendNumbers(StringBuilder phoneNumber, int begin, int end, int[] numbers){
        for (int i = begin; i < end; i ++){
            phoneNumber.append(String.valueOf(numbers[i]));
        }
        return phoneNumber;
    }


    public String create(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder();
        if (numbers.length == 0 || numbers.length >= 11){
            phoneNumber.append("");
            return phoneNumber.toString();
        }

        phoneNumber.append("(");
        appendNumbers(phoneNumber, 0, 3, numbers);
        phoneNumber.append(") ");
        appendNumbers(phoneNumber, 3, 6, numbers);
        phoneNumber.append("-");
        appendNumbers(phoneNumber, 6, 10, numbers);

        return phoneNumber.toString();
    }
}
