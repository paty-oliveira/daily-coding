import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PangramTest {
    
    public Pangram pangramChecker;
    
    public PangramTest() {
        this.pangramChecker = new Pangram();
    }

    @Test
    void shouldReturnFalseWhenSentenceInputIsEmpty() throws Exception{
        String inputSentence = "";
        Boolean actualResult = this.pangramChecker.isPangram(inputSentence);

        Assertions.assertFalse(actualResult);
    }

    @Test
    void shouldReturnTrueWhenSentenceInputHasAllAlphabetLettersInAlphabeticOrder() throws Exception {
        String inputSentence = "abcdefghijklmnopqrstuvwxyz";
        Boolean actualResult = this.pangramChecker.isPangram(inputSentence);

        Assertions.assertTrue(actualResult);
    }

    @Test
    void shouldReturnFalseWhenSentenceInputHasNotAllAlphabetLetters() throws Exception{
        String inputSentence = "aeiou";
        Boolean actualResult = this.pangramChecker.isPangram(inputSentence);

        Assertions.assertFalse(actualResult);
    }

    @Test
    void shouldReturnTrueWhenSentenceInputHasEveryLetterOfAlphabet() throws Exception {
        String inputSentence = "The quick brown fox jumps over the lazy dog";
        Boolean actualResult = this.pangramChecker.isPangram(inputSentence);

        Assertions.assertTrue(actualResult);
    }
}