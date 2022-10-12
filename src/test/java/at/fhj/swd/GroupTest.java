package at.fhj.swd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupTest {
    private Group g;

    @BeforeEach
    public void setup() {
        g = new Group(1, "students");

        User u1 = new User(3, "homer", "***");
        g.addUser(u1);
        u1.setGroup(g);

        User u2 = new User(5, "marge", "***");
        g.addUser(u2);
        u2.setGroup(g);
    }


    @Test
    public void testUsers() {
        assertEquals(2, g.getUsers().size());

        assertEquals("homer", g.getUsers().get(0).getUsername());
        assertEquals("marge", g.getUsers().get(1).getUsername());
    }


    @Test
    public void testUserToGroupToUser() {
        User u1 = g.getUsers().get(0);
        assertEquals("homer", u1.getUsername());

        assertEquals("students", u1.getGroup().getName());
    }
}
