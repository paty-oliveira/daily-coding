import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitTest {
    private final Digit calculator;

    public DigitTest() {
        this.calculator = new Digit();
    }

    @Test
    void shouldReturnSumOfAllDigitsWhenInputNumberHasOneDigit() throws Exception{
        int inputNumber = 1;
        int actualResult = this.calculator.calculateDigitalRoot(inputNumber);
        int expectedResult = 1;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnSumOfAllDigitsWhenInputNumberHasTwoDigits() throws Exception{
        int inputNumber = 12;
        int actualResult = this.calculator.calculateDigitalRoot(inputNumber);
        int expectedResult = 3;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnSumOfAllDigitsWhenInputNumberHasThreeDigits() throws Exception {
        int inputNumber = 942;
        int actualResult = this.calculator.calculateDigitalRoot(inputNumber);
        int expectedResult = 6;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnSumOfAllDigitsWhenInputNumberHasFourDigits() throws Exception {
        int inputNumber = 7562;
        int actualResult = this.calculator.calculateDigitalRoot(inputNumber);
        int expectedResult = 2;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnSumOfAllDigitsWhenInputNumberHasSixDigits() throws Exception{
        int inputNumber = 132189;
        int actualResult = this.calculator.calculateDigitalRoot(inputNumber);
        int expectedResult = 6;

        assertEquals(expectedResult, actualResult);
    }
}