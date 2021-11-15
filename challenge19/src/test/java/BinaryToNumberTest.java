import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.LongUnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToNumberTest {
    private final Binary convertor;

    public BinaryToNumberTest() {
        this.convertor = new Binary();
    }

    @Test
    void shouldReturnNumericRepresentationOfNumberZeroBasedOnBinaryRepresentation() throws Exception {
        List<Integer> binaryNumber = new ArrayList<>(List.of(0, 0, 0, 0));
        int actualResult = this.convertor.convertToInteger(binaryNumber);
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnNumericRepresentationOfNumberOneBasedOnBinaryRepresentation() throws Exception {
        List<Integer> binaryNumber = new ArrayList<>(List.of(0, 0, 0, 1));
        int actualResult = this.convertor.convertToInteger(binaryNumber);
        int expectedResult = 1;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnNumericRepresentationOfNumberNineBasedOnBinaryRepresentation() throws Exception {
        List<Integer> binaryNumber = new ArrayList<>(List.of(1, 0, 0, 1));
        int actualResult = this.convertor.convertToInteger(binaryNumber);
        int expectedResult = 9;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnNumericRepresentationOfNumberFifteenBasedOnBinaryRepresentation() throws Exception {
        List<Integer> binaryNumber = new ArrayList<>(List.of(1, 1, 1, 1));
        int actualResult = this.convertor.convertToInteger(binaryNumber);
        int expectedResult = 15;

        assertEquals(expectedResult, actualResult);
    }
}