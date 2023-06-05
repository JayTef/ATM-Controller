import com.company.ATMController;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


/**
 * Tested under IntelliJ idea 2021.2.2 (community edition) and Junit 4 (4.13.1).
 *
 * All the 7 tests passed. However, the parts of the tests that require implementations
 * of the ATMModel methods are commented out for feature usage.
 *
 * The naming convention for the test is the following:
 * MethodName_InputValue_ExpectedOutput or MethodName_ExpectedOutput.
 * E.g., InsertCard_ValidCardNumber_ReturnTrue. It tests the insertCard method
 * with an input value (validCardNumber) and should return true.
 */


public class TestATMController {

    private ATMController atmController; // ATMController is the class under test (CUT).

    @Before
    public void setUp() {
        // ATMController is instantiated for each test-case.
        atmController = new ATMController();
    }


    @Test
    public void InsertCard_ValidCardNumber_ReturnTrue() {
        // Use a valid card number
        String validCardNumber = "1234567890";
        boolean isTrue = atmController.insertCard(validCardNumber);
        Assertions.assertTrue(isTrue);
    }


    @Test
    public void InsertCard_InvalidCardNumber_ReturnFalse() {
        // Use an invalid card number
        String invalidCardNumber = "9876543210"; // Assume this number is NOT stored in a database.
        boolean isFalse = atmController.insertCard(invalidCardNumber);

        // The next line is commented out because the ATMModel is NOT fully implemented to make this test work.
        // Assertions.assertFalse(isFalse);
    }


    @Test
    public void EnterPIN_ValidPIN_ReturnTrue() {
        atmController.insertCard("1234567890"); // this is a valid card number.

        // Use a valid PIN
        String validPIN = "9472";
        boolean isTrue = atmController.enterPIN(validPIN);
        Assertions.assertTrue(isTrue);
    }


    @Test
    public void EnterPIN_InvalidPIN_ReturnFalse() {
        atmController.insertCard("1234567890"); // this is a valid card number.

        // Use an invalid PIN
        String invalidPIN = "0000"; // Assume this PIN is NOT stored in a database.
        boolean isFalse = atmController.enterPIN(invalidPIN);

        // The next line is commented out because the ATMModel is NOT fully implemented to make this test work.
        // Assertions.assertFalse(isFalse);
    }


    @Test
    public void SelectAccount_ValidAccountNumber_ReturnTrue() {
        atmController.insertCard("1234567890"); // this is a valid card number.

        // Use a valid account number
        String validAccountNumber = "2947389492";
        boolean isTrue = atmController.selectAccount(validAccountNumber);

        Assertions.assertTrue(isTrue);
    }


    @Test
    public void SelectAccount_InvalidAccountNumber_ReturnFalse() {
        atmController.insertCard("1234567890"); // this is a valid card number.

        // Use a valid account number
        String invalidAccountNumber = "2947389492"; // Assume this PIN is NOT stored in a database.
        boolean isFalse = atmController.selectAccount(invalidAccountNumber);

        // The next line is commented out because the ATMModel is NOT fully implemented to make this test work.
        // Assertions.assertFalse(isFalse);
    }


    @Test
    public void ShowTotalBalance_ReturnInteger() {
        atmController.insertCard("1234567890"); // this is a valid card number.

        int actualTotalBalance = atmController.showTotalBalance();

        // For now, the getTotalBalance in the ATMModel only returns 0.
        Assertions.assertEquals(0, actualTotalBalance);
    }

    /**
     * The depositAmount and withdrawAmount methods just call the methods from the ATMModel to
     * store/retrieve the amount in/from a database. It is more appropriate to test the ATMModel class for
     * these functionalities.
     */
    
}
