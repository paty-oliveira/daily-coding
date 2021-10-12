import java.util.Arrays;

public class Array {

    public int[] differenceBetween(int[] array1, int[] array2) {
        return Arrays.stream(array1).filter(
                array1_element -> Arrays.stream(array2).noneMatch(
                        array2_element -> array1_element == array2_element
                )
        ).toArray();
    }
}
