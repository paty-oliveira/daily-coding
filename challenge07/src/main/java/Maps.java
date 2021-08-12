import java.util.List;
import java.util.stream.Collectors;

/**
 * Given an array of integers, return a new array with each value doubled.
 * Example:
 * [1, 2, 3] --> [2, 4, 6]
 */

public class Maps {
    public List<Integer> maps(List<Integer> inputList) {
        return inputList
                .stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());
    }
}
