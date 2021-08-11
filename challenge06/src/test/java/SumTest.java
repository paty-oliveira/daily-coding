import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    private final Sum sum;

    public SumTest() {
        this.sum = new Sum();
    }

    @Test
    void shouldReturnSumOfTwoConsecutiveNumbers() throws Exception {
        int inputNumber1 = 1;
        int inputNumber2 = 0;
        int actualResult = this.sum.getSum(inputNumber1, inputNumber2);
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAccumulatedSumOfOnePositiveNumberAndNegativeNumbers() throws Exception {
        int inputNumber1 = -1;
        int inputNumber2 = 2;
        int actualResult = this.sum.getSum(inputNumber1, inputNumber2);
        int expectedResult = 2;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAccumulatedSumOfTwoPositiveNumbers() throws Exception {
        int inputNumber1 = 9;
        int inputNumber2 = 20;
        int actualResult = this.sum.getSum(inputNumber1, inputNumber2);
        int expectedResult = 174;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAccumulatedSumOfTwoNegativeNumbers() throws Exception {
        int inputNumber1 = -4;
        int inputNumber2 = -2;
        int actualResult = this.sum.getSum(inputNumber1, inputNumber2);
        int expectedResult = -9;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTheSameNumberIfTheTwoNumbersAreEquals() throws Exception {
        int inputNumber1 = 1;
        int inputNumber2 = 1;
        int actualResult = this.sum.getSum(inputNumber1, inputNumber2);
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult, actualResult);
    }
}