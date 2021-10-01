package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public List<User> listUsers(){
     return users;
    }
}
