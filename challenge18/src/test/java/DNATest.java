import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNATest {

    private final DNA dna;

    public DNATest() {
        this.dna = new DNA();
    }

    @Test
    void ShouldReturnTheConversionOfDNAInRNA() throws Exception {
        String dnaSequence = "TTTT";
        String actualResult = this.dna.convertToRNA(dnaSequence);
        String expectedResult = "UUUU";

        assertEquals(expectedResult, actualResult);

        dnaSequence = "GCAT";
        actualResult = this.dna.convertToRNA(dnaSequence);
        expectedResult = "GCAU";

        assertEquals(expectedResult, actualResult);

        dnaSequence = "GGCC";
        actualResult = this.dna.convertToRNA(dnaSequence);
        expectedResult = "GGCC";

        assertEquals(expectedResult, actualResult);
    }
}