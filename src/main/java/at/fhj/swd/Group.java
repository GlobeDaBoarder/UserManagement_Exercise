package at.fhj.swd;

import java.util.ArrayList;
import java.util.List;

public class Group extends Entity{
    private String name;
    private List<User> users;

    public Group(int id, String name) {
        setId(id);
        this.name = name;
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
