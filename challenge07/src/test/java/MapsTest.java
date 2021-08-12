import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class MapsTest {
    private final Maps map;

    public MapsTest() {
        this.map = new Maps();
    }

    @Test
    void shouldReturnAnEmptyListWhenInputListIsEmpty() throws Exception {
        List<Integer> inputList = Collections.emptyList();
        List<Integer> actualResult = this.map.maps(inputList);
        List<Integer> expectedResult = Collections.emptyList();

        Assertions.assertTrue(actualResult.containsAll(expectedResult)
                && expectedResult.containsAll(actualResult));
    }

    @Test
    void shouldReturnAListOfOnePositiveIntegerWithValueDoubled() throws Exception {
        List<Integer> inputList = Collections.singletonList(1);
        List<Integer> actualResult = this.map.maps(inputList);
        List<Integer> expectedResult = Collections.singletonList(2);

        Assertions.assertTrue(actualResult.containsAll(expectedResult)
                && expectedResult.containsAll(actualResult));
    }

    @Test
    void shouldReturnAListOfTwoPositiveIntegersWithValuesDoubled() throws Exception {
        List<Integer> inputList = Arrays.asList(1, 2);
        List<Integer> actualResult = this.map.maps(inputList);
        List<Integer> expectedResult = Arrays.asList(2, 4);

        Assertions.assertTrue(actualResult.containsAll(expectedResult)
                && expectedResult.containsAll(actualResult));
    }

    @Test
    void shouldReturnAListOfThreePositiveIntegersWithValuesDoubled() throws Exception {
        List<Integer> inputList = Arrays.asList(1, 2, 3);
        List<Integer> actualResult = this.map.maps(inputList);
        List<Integer> expectedResult = Arrays.asList(2, 4, 6);

        Assertions.assertTrue(actualResult.containsAll(expectedResult)
                && expectedResult.containsAll(actualResult));
    }

    @Test
    void shouldReturnAListOfThreeNegativeIntegersWithValuesDoubled() throws Exception {
        List<Integer> inputList = Arrays.asList(-1, -2, -5);
        List<Integer> actualResult = this.map.maps(inputList);
        List<Integer> expectedResult = Arrays.asList(-2, -4, -10);

        Assertions.assertTrue(actualResult.containsAll(expectedResult)
                && expectedResult.containsAll(actualResult));
    }
}