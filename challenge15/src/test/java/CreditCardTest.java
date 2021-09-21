import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    private final CreditCard creditCard;

    public CreditCardTest() {
        this.creditCard = new CreditCard();
    }

    @Test
    void shouldReturnInvalidCreditCardWhenCreditCardNumberIsEmpty() throws Exception {
        String creditCardNumber = "";
        boolean actualResult = this.creditCard.validate(creditCardNumber);
        assertFalse(actualResult);
    }

    @Test
    void shouldReturnInvalidCreditCardWhenNumberOfDigitsIsOddAndLuhnAlgorithmReturnsFalse() throws Exception {
        String creditCardNumber = "123";
        boolean actualResult = this.creditCard.validate(creditCardNumber);
        assertFalse(actualResult);
    }

    @Test
    void shouldReturnInvalidCreditCardWhenNumberOfDigitsIsEvenAndLuhnAlgorithmReturnsFalse() throws Exception{
        String creditCardNumber = "1714";
        boolean actualResult = this.creditCard.validate(creditCardNumber);
        assertFalse(actualResult);
    }
}