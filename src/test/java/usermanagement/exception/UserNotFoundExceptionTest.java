package usermanagement.exception;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserNotFoundExceptionTest {
    @Test
    public void userNotFoundExceptionTest() {
        UserNotFoundException exception = new UserNotFoundException("message", 20);
        assertEquals(20, exception.getUserId().intValue());
    }

}