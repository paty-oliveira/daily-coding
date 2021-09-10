import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {

    @Test
    void shouldReturnEmptyWordWhenInputWordIsEmpty() throws Exception {
        String letters = "";
        Word word = new Word(letters);
        String actualResult = word.splitByCamelCasing();
        String expectedResult = "";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTheSameWordWhenTheInputWordDoesNotHaveCamelCasing() throws Exception {
        String letters = "identifier";
        Word word = new Word(letters);
        String actualResult = word.splitByCamelCasing();
        String expectedResult = "identifier";

        assertEquals(actualResult, expectedResult);
    }

    @Test
    void shouldReturnTwoWordsSplitByASpaceWhenInputWordHasTwoWordsInCamelCasing() throws Exception {
        String letters = "camelCasing";
        Word word = new Word(letters);
        String actualResult = word.splitByCamelCasing();
        String expectedResult = "camel Casing";

        assertEquals(actualResult, expectedResult);
    }

    @Test
    void shouldReturnThreeWordsSplitByASpaceWhenInputWordsHasThreeWordsInCamelCasing() throws Exception {
        String letters = "splitByZero";
        Word word = new Word(letters);
        String actualResult = word.splitByCamelCasing();
        String expectedResult = "split By Zero";

        assertEquals(actualResult, expectedResult);
    }
}