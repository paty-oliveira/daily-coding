import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {

    private final PhoneNumber phoneNumber;

    public PhoneNumberTest() {
        this.phoneNumber = new PhoneNumber();
    }

    @Test
    void shouldReturnAnEmptyPhoneNumberWhenTheInputNumbersAreEmpty() throws Exception {
        int[] numbers = {};
        String actualResult = this.phoneNumber.create(numbers);
        String expectedResult = "";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAnEmptyPhoneNumberWhenTheInputNumbersHasMoreThanTenNumbers() throws Exception{
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
        String actualResult = this.phoneNumber.create(numbers);
        String expectedResult = "";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAValidPhoneNumber() throws Exception {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String actualResult = this.phoneNumber.create(numbers);
        String expectedResult = "(123) 456-7890";

        assertEquals(expectedResult, actualResult);
    }
}