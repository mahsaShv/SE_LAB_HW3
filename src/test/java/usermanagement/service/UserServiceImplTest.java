package usermanagement.service;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import usermanagement.repository.PersonRepository;

public class UserServiceImplTest extends TestCase {
    @Test
    public void test_save_and_find() {
        User user1 = new User();
        User user2 = new User();
        user1.setUserId(1);
        UserServiceImpl userService = new UserServiceImpl();

        userService.save(user1);
        userService.save(user2);

        assertEquals(userService.findById(1).equals(user1), true);


    }

}