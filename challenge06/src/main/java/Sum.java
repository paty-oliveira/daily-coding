import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * Given two integers a and b, which can be positive or negative, find the sum of all the integers between
 * and including them and return it. If the two numbers are equal return a or b.
 *
 */

public class Sum {

    public int getSum(int number1, int number2) {
        List<Integer> numbers = putNumberInList(number1, number2);
        int maxNumber = getMaximumNumber(numbers);
        int minNumber = getMinimumNumber(numbers);
        int sum = 0;

        for (int number = minNumber; number <= maxNumber; number++){
            sum += number;
        }

        return sum;
    }

    public int getMinimumNumber(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    public int getMaximumNumber(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    public List<Integer> putNumberInList(int number1, int number2){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number1);
        numbers.add(number2);

        return numbers;
    }
}
