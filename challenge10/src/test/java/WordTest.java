import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    private final Word convertor;

    public WordTest() {
        this.convertor = new Word();
    }

    @Test
    void shouldReturnOneWordInReverseWay() throws Exception{
        String wordInput = "This";
        String actualResult = this.convertor.toReverse(wordInput);
        String expectedResult = "sihT";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTwoWordsSeparatedBySpaceInReverseWay() throws Exception {
        String wordInput = "This is";
        String actualResult = this.convertor.toReverse(wordInput);
        String expectedResult = "sihT si";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAPhraseInReverseWay() throws Exception {
        String wordInput = "This is an example!";
        String actualResult = this.convertor.toReverse(wordInput);
        String expectedResult = "sihT si na !elpmaxe";

        assertEquals(expectedResult, actualResult);
    }
}