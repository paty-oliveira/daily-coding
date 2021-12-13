import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private final Order order;

    public OrderTest() {
        this.order = new Order();
    }

    @Test
    void shouldReturnEmptyWhenInputStringIsEmpty() throws Exception {
        String words = "";
        String actualResult = this.order.sortByNumber(words);
        String expectedResult = "";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTheSameWordWhenStringInputContainsOneWord() throws Exception {
        String words = "Thi1s";
        String actualResult = this.order.sortByNumber(words);
        String expectedResult = "Thi1s";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTwoWordsSortedByTheirNumber() throws Exception {
        String words = "tes2t Thi1s";
        String actualResult = this.order.sortByNumber(words);
        String expectedResult = "Thi1s tes2t";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnManyWordsSortedByTheirNumber() throws Exception {
        String words = "4of Fo1r pe6ople g3ood th5e the2";
        String actualResult = this.order.sortByNumber(words);
        String expectedResult = "Fo1r the2 g3ood 4of th5e pe6ople";

        assertEquals(expectedResult, actualResult);
    }
}