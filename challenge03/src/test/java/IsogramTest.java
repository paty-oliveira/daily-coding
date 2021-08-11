import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsogramTest {

    Isogram isogram;
    
    public IsogramTest() {
        this.isogram = new Isogram();
    }

    @Test
    void shouldReturnTrueWhenWordIsEmpty() throws Exception {
        String wordInput = "";
        boolean actualResult = this.isogram.isIsogram(wordInput);

        Assertions.assertTrue(actualResult);
    }

    @Test
    void shouldReturnFalseWhenWordHasNumbers() {
        String wordInput = "13234";
        boolean actualResult = this.isogram.isIsogram(wordInput);

        Assertions.assertFalse(actualResult);
    }

    @Test
    void shouldReturnTrueWhenWordHasUniqueLetters() throws Exception {
        String wordInput = "ab";
        boolean actualResult = this.isogram.isIsogram(wordInput);

        Assertions.assertTrue(actualResult);
    }

    @Test
    void shouldReturnFalseWhenWordHasDuplicateLetters() throws Exception {
        String wordInput = "aba";
        boolean actualResult = this.isogram.isIsogram(wordInput);

        Assertions.assertFalse(actualResult);
    }

    @Test
    void shouldReturnTrueWhenWordHasUpperAndLowerCaseLettersWithoutDuplicatedLetters() throws Exception{
        String wordInput = "Dermatoglyphics";
        boolean actualResult = this.isogram.isIsogram(wordInput);

        Assertions.assertTrue(actualResult);
    }

    @Test
    void shouldReturnFalseWhenWordHasUniqueLettersButAlsoNumbers() throws Exception {
        String wordInput = "moO1se";
        boolean actualResult = this.isogram.isIsogram(wordInput);

        Assertions.assertFalse(actualResult);
    }
}