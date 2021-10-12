import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    private final Array array;

    public ArrayTest() {
        this.array = new Array();
    }

    @Test
    void shouldReturnAnEmptyArrayWhenTwoInputArraysAreEmpty() throws Exception {
        int[] array1 = {};
        int[] array2 = {};
        int[] actualResult = this.array.differenceBetween(array1, array2);
        int[] expectedResult = {};

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTheDifferenceBetweenTwoInputArrays() throws Exception {
        int[] array1 = {1, 2};
        int[] array2 = {1};
        int[] actualResult = this.array.differenceBetween(array1, array2);
        int[] expectedResult = {2};

        assertArrayEquals(expectedResult, actualResult);
    }
}