import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JadenCasingStringsTest {
    private final JadenCasingStrings stringConvertor;

    public JadenCasingStringsTest() {
        this.stringConvertor = new JadenCasingStrings();
    }

    @Test
    void shouldReturnEmptyStringWhenStringInputIsEmpty() throws Exception {
        String inputPhrase = "";
        String actualResult = this.stringConvertor.convertToJadenString(inputPhrase);
        String expectedResult = "";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnFirstLetterInUpperCase() throws Exception{
        String inputPhrase = "how";
        String actualResult = this.stringConvertor.convertToJadenString(inputPhrase);
        String expectedResult = "How";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnFirstLetterInUpperCaseOfTwoInputStrings() throws Exception{
        String inputPhrase = "how can";
        String actualResult = this.stringConvertor.convertToJadenString(inputPhrase);
        String expectedResult = "How Can";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnFirstLetterInUpperCaseOfThreeInputStrings() throws Exception {
        String inputPhrase = "how can mirrors";
        String actualResult = this.stringConvertor.convertToJadenString(inputPhrase);
        String expectedResult = "How Can Mirrors";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnFirstLetterInUpperCaseOfTenInputStrings() throws Exception{
        String inputPhrase = "How can mirrors be real if our eyes aren't real";
        String actualResult = this.stringConvertor.convertToJadenString(inputPhrase);
        String expectedResult = "How Can Mirrors Be Real If Our Eyes Aren't Real";

        Assertions.assertEquals(expectedResult, actualResult);
    }
}