import java.util.Map;

/**
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions"
 * for the development and functioning of living organisms.
 *
 * If you want to know more: http://en.wikipedia.org/wiki/DNA
 *
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
 * You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side.
 * DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 *
 */

public class DnaStrand {

    Map<Character, Character> complementaryDnaBasesInfo = Map.of(
            'A', 'T',
            'T', 'A',
            'G','C',
            'C', 'G'
    );

    public String makeComplement(String dnaSequence) throws Exception {
        StringBuilder complementaryStrand = new StringBuilder();

        for (char nucleotide: dnaSequence.toUpperCase().toCharArray()){
            if (complementaryDnaBasesInfo.containsKey(nucleotide)){
                complementaryStrand.append(complementaryDnaBasesInfo.get(nucleotide));
            }
            else {
                throw new Exception("DNA sequence invalid.");
            }
        }
        return complementaryStrand.toString();
    }
}
