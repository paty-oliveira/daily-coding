import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoToOneTest {

    private final LettersConvertor convertor;

    public TwoToOneTest() {
        this.convertor = new LettersConvertor();
    }

    @Test
    void shouldReturnAnEmptyStringWhenInputStatementsAreEmpty() {
        String inputLetters1 = "";
        String inputLetters2 = "";
        String actualResult = this.convertor.distinctLetters(inputLetters1, inputLetters2);
        String expectedResult = "";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTheInputStatementsWithoutDuplicatesLettersWhenOneOfInputStatementIsEmpty() {
        String inputLetters1 = "abbbbccccfffffff";
        String inputLetters2 = "";
        String actualResult = this.convertor.distinctLetters(inputLetters1, inputLetters2);
        String expectedResult = "abcf";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTheResultOfConcatenationOfTwoInputStatementsWithoutDuplicatesLetters() {
        String inputLetters1 = "abc";
        String inputLetters2 = "def";
        String actualResult = this.convertor.distinctLetters(inputLetters1, inputLetters2);
        String expectedResult = "abcdef";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTheResultOfConcatenationOfTwoInputStatementsWithDuplicatesLetters() {
        String inputLetters1 = "abcdef";
        String inputLetters2 = "efghij";
        String actualResult = this.convertor.distinctLetters(inputLetters1, inputLetters2);
        String expectedResult = "abcdefghij";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTheResultOfConcatenationOfTwoInputStatementsWithDuplicatesLettersInSortedWay() {
        String inputLetters1 = "xyaabbbccccdefww";
        String inputLetters2 = "xxxxyyyyabklmopq";
        String actualResult = this.convertor.distinctLetters(inputLetters1, inputLetters2);
        String expectedResult = "abcdefklmopqwxy";

        assertEquals(expectedResult, actualResult);
    }
}