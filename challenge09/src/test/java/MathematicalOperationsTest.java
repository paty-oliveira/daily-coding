import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathematicalOperationsTest {

    @Test
    void shouldReturnTheSumOfTwoNumbers() {
        Operatorable sumOperator = new Sum();
        MathematicalOperation mathOperation = new MathematicalOperation(sumOperator);
        int number1 = 4;
        int number2 = 7;
        int actualResult = mathOperation.compute(number1, number2);
        int expectedResult = 11;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTheSubtractionOfTwoNumbers() {
        Operatorable subtractionOperator = new Subtraction();
        MathematicalOperation mathOperation = new MathematicalOperation(subtractionOperator);
        int number1 = 15;
        int number2 = 18;
        int actualResult = mathOperation.compute(number1, number2);
        int expectedResult = -3;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTheMultiplicationOfTwoNumbers() {
        Operatorable multiplicationOperator = new Multiplication();
        MathematicalOperation mathOperation = new MathematicalOperation(multiplicationOperator);
        int number1 = 5;
        int number2 = 5;
        int actualResult = mathOperation.compute(number1, number2);
        int expectedResult = 25;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTheDivisionOfTwoNumbers() {
        Operatorable divisionOperator = new Division();
        MathematicalOperation mathOperation = new MathematicalOperation(divisionOperator);
        int number1 = 49;
        int number2 = 7;
        int actualResult = mathOperation.compute(number1, number2);
        int expectedResult = 7;

        assertEquals(expectedResult, actualResult);
    }
}