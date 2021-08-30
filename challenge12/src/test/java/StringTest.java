import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitTest {
    private final StringSplit splitter;

    public StringSplitTest() {
        this.splitter = new StringSplit();
    }

    @Test
    void shouldReturnTwoPairsOfCharactersWhenStringInputLengthIsAEvenNumber() throws Exception{
        String inputCharacters = "abcd";
        String[] actualResult = this.splitter.apply(inputCharacters);
        String[] expectedResult = {"ab", "cd"};

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTwoPairsOfCharactersWithTheLastPairWithAnUnderscoreInTheEndWhenStringInputContainsAOddNumber()
            throws Exception{
        String inputCharacters = "abc";
        String[] actualResult = this.splitter.apply(inputCharacters);
        String[] expectedResult = {"ab", "c_"};

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnThreePairsOfCharactersWhenStringInputLengthIsAEvenNumber() throws Exception{
        String inputCharacters = "abcdef";
        String[] actualResult = this.splitter.apply(inputCharacters);
        String[] expectedResult = {"ab", "cd", "ef"};

        assertArrayEquals(expectedResult, actualResult);
    }
}


