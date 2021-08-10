import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DnaStrandTest {
    private final DnaStrand dna;

    public DnaStrandTest() {
        this.dna = new DnaStrand();
    }

    @Test
    void shouldReturnAnEmptyStringWhenDNASequenceIsEmpty() throws Exception {
        String inputSequence = "";
        String actualResult = this.dna.makeComplement(inputSequence);
        String expectedResult = "";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAComplementaryDnaBaseOfAdenine() throws Exception {
        String inputSequence = "A";
        String actualResult = this.dna.makeComplement(inputSequence);
        String expectedResult = "T";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAComplementaryDnaBaseOfGuanine() throws Exception {
        String inputSequence = "G";
        String actualResult = this.dna.makeComplement(inputSequence);
        String expectedResult = "C";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAComplementaryDnaBaseOfThymine() throws Exception{
        String inputSequence = "T";
        String actualResult = this.dna.makeComplement(inputSequence);
        String expectedResult = "A";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAComplementaryDnaBaseOfCytosine() throws Exception {
        String inputSequence = "C";
        String actualResult = this.dna.makeComplement(inputSequence);
        String expectedResult = "G";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAComplementaryStrandOfTwoDnaBases() throws Exception {
        String inputSequence = "AA";
        String actualResult = this.dna.makeComplement(inputSequence);
        String expectedResult = "TT";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAComplementaryStrandOfThreeDnaBases() throws Exception {
        String inputSequence = "GTAT";
        String actualResult = this.dna.makeComplement(inputSequence);
        String expectedResult = "CATA";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAComplementaryStrandOfSeventeenDnaBases() throws Exception {
        String inputSequence = "AAAAAAAAAAAAAAAAA";
        String actualResult = this.dna.makeComplement(inputSequence);
        String expectedResult = "TTTTTTTTTTTTTTTTT";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldRaiseAnExceptionWhenDnaSequenceContainsInvalidBases() throws Exception {
        Assertions.assertThrows(Exception.class, () -> {
            String inputSequence = "AGGTxxxxCGGCCC";
            this.dna.makeComplement(inputSequence);
        });
    }
}