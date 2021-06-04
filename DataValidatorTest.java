package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataValidatorTest {

    @Test
    void isValidCPRtest() {
        DataValidator DataVali = new DataValidator();
        String input = "abc";
        boolean actualResult = DataVali.isValidCPR(input);
        assertEquals (false, actualResult, "CPR-number can only contain numbers");
    }

    @Test
    void isValidNametest() {
        DataValidator DataVali = new DataValidator();
        String input = "123.-.";
        boolean actualResult = DataVali.isValidName(input);
        assertEquals (false, actualResult, "Name can only contain letters");
    }

    @Test
    void isValidEmailtest() {
        DataValidator DataVali = new DataValidator();
        String input = "??";
        boolean actualResult = DataVali.isValidEmail(input);
        assertEquals (false, actualResult, "Email can not contain invalid characters");
    }

    @Test
    void isValidPhonetest() {
        DataValidator DataVali = new DataValidator();
        String input = "hej";
        boolean actualResult = DataVali.isValidPhone(input);
        assertEquals (false, actualResult, "Phone-number can only contain numbers");
    }


    @Test
    void isValidCoronaLocationtest() {
        DataValidator DataVali = new DataValidator();
        String input = "hej";
        boolean actualResult = DataVali.isValidCoronaLocation(input);
        assertEquals (false, actualResult, "CoronaLocation can only contain 'testcenter'");
    }

    @Test
    void isValidCovidDatatest() {
        DataValidator DataVali = new DataValidator();
        String input = "lol123";
        boolean actualResult = DataVali.isValidCovidData(input);
        assertEquals (false, actualResult, "CovidData can only contain positive or negative");
    }
}
