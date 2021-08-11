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
        boolean actualResult = this.pangramChecker.isPangram(inputSentence);

        Assertions.assertFalse(actualResult);
    }

    @Test
    void shouldReturnTrueWhenSentenceInputHasAllAlphabetLettersInAlphabeticOrder() throws Exception {
        String inputSentence = "abcdefghijklmnopqrstuvwxyz";
        boolean actualResult = this.pangramChecker.isPangram(inputSentence);

        Assertions.assertTrue(actualResult);
    }

    @Test
    void shouldReturnFalseWhenSentenceInputHasNotAllAlphabetLetters() throws Exception{
        String inputSentence = "aeiou";
        boolean actualResult = this.pangramChecker.isPangram(inputSentence);

        Assertions.assertFalse(actualResult);
    }

    @Test
    void shouldReturnTrueWhenSentenceInputHasEveryLetterOfAlphabet() throws Exception {
        String inputSentence = "The quick brown fox jumps over the lazy dog";
        boolean actualResult = this.pangramChecker.isPangram(inputSentence);

        Assertions.assertTrue(actualResult);
    }
}