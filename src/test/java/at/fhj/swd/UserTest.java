package at.fhj.swd;

import at.fhj.swd.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest
{
    @Test
    public void testConstructor()
    {
        User u = new User(3, "homer", "*****");
        
        assertEquals(3, u.getId());
        assertEquals("homer", u.getUsername());
        assertEquals("*****", u.getPassword());
    }

    @Test
    public void testConstructor_UsernameIsNull()
    {
        assertThrows(IllegalArgumentException.class, () -> {
            new User(3, null, "*****");
        });
    }
    
    @Test
    public void testConstructor_PasswordIsNull()
    {
        assertThrows(IllegalArgumentException.class, () -> {
            new User(3, "homer", null);
        });
    }
    
    @Test
    public void testToString()
    {
        User u = new User(3, "homer", "*****");
        final String EXPECTED = "3,homer,*****";
        assertEquals(EXPECTED, u.toString());
    }
    
}
