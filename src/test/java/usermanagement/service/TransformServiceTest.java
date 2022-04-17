package usermanagement.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import usermanagement.entity.Person;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TransformServiceTest {


    @InjectMocks
    private TransformService transformService;

    @Test
    public void toUserEntityTest() {
        User user = new User();
        user.setCompanyName("company");
        user.setFirstName("fName");
        user.setLastName("lName");
        Person person = transformService.toUserEntity(user);
        assertEquals("company", person.getCompanyName());
        assertEquals("fName", person.getfName());
        assertEquals("lName", person.getlName());


    }

    @Test
    public void toUserDomainTest() {
        Person person = new Person();
        person.setfName("fName");
        person.setlName("lName");
        person.setCompanyName("company");
        User user = transformService.toUserDomain(person);
        assertEquals("company", user.getCompanyName());
        assertEquals("fName", user.getFirstName());
        assertEquals("lName", user.getLastName());

    }


}
