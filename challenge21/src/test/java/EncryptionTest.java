import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {

    private final Encryption encryption;

    public EncryptionTest() {
        this.encryption = new Encryption();
    }

    @Test
    void shouldReturnEmptyEncryptedMessageWhenMessageIsEmpty() throws Exception {
        String message = "";
        String actualResult = this.encryption.encrypt(message);
        String expectedResult = "";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnEncryptedMessageWhenMessageContainsThreeLetters() throws Exception {
        String message = "Hel";
        String actualResult = this.encryption.encrypt(message);
        String expectedResult = "72le";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnEncryptedMessageWhenMessageContainsFiveLetters() throws Exception {
        String message = "Hello";
        String actualResult = this.encryption.encrypt(message);
        String expectedResult = "72olle";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnEncryptedMessageWhenMessageContainsSpacesBetweenWords() throws Exception{
        String message = "hello world";
        String actualResult = this.encryption.encrypt(message);
        String expectedResult = "104olle 119drlo";

        assertEquals(expectedResult, actualResult);
    }
}

