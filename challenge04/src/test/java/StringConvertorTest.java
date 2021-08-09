import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringConvertorTest {

    private final StringConvertor convertor;

    public StringConvertorTest() {
        this.convertor = new StringConvertor();
    }

    @Test
    void shouldConvertStringOneToNumberRepresentation() throws Exception {
        String inputNumber = "1";
        Integer actualResult = this.convertor.toNumber(inputNumber);
        Integer expectedResult = 1;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldConvertStringOneTwoThreeFourToNumberRepresentation() throws Exception {
        String inputNumber = "1234";
        Integer actualResult = this.convertor.toNumber(inputNumber);
        Integer expectedResult = 1234;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldConvertStringWithNegativeNumberToNumberRepresentation() throws Exception {
        String inputNumber = "-9";
        Integer actualResult = this.convertor.toNumber(inputNumber);
        Integer expectedResult = -9;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldConvertStringNumberToNumberRepresentation() throws Exception {
        String inputNumber = "09999";
        Integer actualResult = this.convertor.toNumber(inputNumber);
        Integer expectedResult = 9999;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldRaiseNumberFormatExceptionWhenInputStringIsNotANumber() throws Exception {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            String inputNumber = "129o";
            this.convertor.toNumber(inputNumber);
        });
    }

    @Test
    void shouldRaiseNumberFormatExceptionWhenInputStringIsEmpty() throws Exception {
        Assertions.assertThrows(NumberFormatException.class, () -> {
           String inputNumber = "";
           this.convertor.toNumber(inputNumber);
        });
    }
}