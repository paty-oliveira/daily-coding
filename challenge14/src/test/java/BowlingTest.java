import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingTest {

    private final Bowling game;

    public BowlingTest() {
        this.game = new Bowling();
    }

    @Test
    void shouldReturnAnyPinKnocked() throws Exception {
        int[] knockedPins = {};
        String actualResult = this.game.knockPin(knockedPins);
        String expectedResult = "I I I I" +
                                " I I I " +
                                "  I I  " +
                                "   I   ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnPinOneKnocked() throws Exception{
        int[] knockedPins = {1};
        String actualResult = this.game.knockPin(knockedPins);
        String expectedResult = "I I I I" +
                                " I I I " +
                                "  I I  " +
                                "       ";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnPinTwoKnocked() throws Exception {
        int[] knockedPins = {2};
        String actualResult = this.game.knockPin(knockedPins);
        String expectedResult = "I I I I" +
                                 " I I I " +
                                 "    I  " +
                                 "   I   ";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTwoPinsKnocked() throws Exception {
        int[] knockedPins = {7, 3};
        String actualResult = this.game.knockPin(knockedPins);
        String expectedResult = "  I I I" +
                                " I I I " +
                                "  I    " +
                                "   I   ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnThreePinsKnocked() throws Exception {
        int[] knockedPins = {3, 5, 9};
        String actualResult = this.game.knockPin(knockedPins);
        String expectedResult = "I I   I" +
                                " I   I " +
                                "  I    " +
                                "   I   ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnAllPinsKnocked() throws Exception {
        int[] knockedPins = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String actualResult = this.game.knockPin(knockedPins);
        String expectedResult = "       " +
                                "       " +
                                "       " +
                                "       ";
        assertEquals(expectedResult, actualResult);
    }
}