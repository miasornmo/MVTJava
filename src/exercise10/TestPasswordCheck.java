package exercise10;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {

    @Test
    public void testCorrectPassword() {

        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;

        boolean actual =  pass.check("pass#word1");

        assertEquals(expected, actual);
    }

    @Test
    public void testAtLessThan8Characters() {

        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        boolean actual =  pass.check("pa€ss1");

        assertEquals(expected, actual);
    }

    @Test
    public void testAtLessThan8CharactersAndNoDigits() {

        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        boolean actual =  pass.check("pas!s");

        assertEquals(expected, actual);
    }

    @Test
    public void testNoDigits() {

        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        boolean actual =  pass.check("pass#word");

        assertEquals(expected, actual);
    }

    @Test
    public void testNoSpecialCharacters() {

        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        boolean actual =  pass.check("passw#ord");

        assertEquals(expected, actual);
    }
}
