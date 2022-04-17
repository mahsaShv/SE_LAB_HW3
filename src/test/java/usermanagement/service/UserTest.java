package usermanagement.service;

import junit.framework.TestCase;
import org.junit.Test;
import usermanagement.entity.Person;

import static org.junit.Assert.assertEquals;

public class UserTest extends TestCase {

    @Test
    public void test_user_equals() {
        User user1 = new User();
        User user2 = new User();

        user2.setUserId(1);
        user1.setUserId(1);
        assertEquals(user1.equals(user2), true);

        user2 = null;
        assertEquals(user1.equals(user2), false);

    }

    @Test
    public void test_user_setters_getters() {
        User user1 = new User();
        user1.setUserId(1);
        user1.setFirstName("Mahsa");
        user1.setLastName("Sheikhi");
        user1.setCompanyName("myCompany");

        assertEquals(user1.getUserId().intValue(), 1);
        assertEquals(user1.getFirstName(), "Mahsa");
        assertEquals(user1.getCompanyName(), "myCompany");
        assertEquals(user1.getLastName(), "Sheikhi");
    }


}