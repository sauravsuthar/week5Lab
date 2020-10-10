package models;

import java.util.ArrayList;

public class AccountService
{

    private final ArrayList<User> AllowedUsers;  

    public AccountService()
    {
        AllowedUsers = new ArrayList<>();
        AllowedUsers.add(new User("abe", "password"));
        AllowedUsers.add(new User("barb", "password"));
    }

    public User login(String username, String password)
    {
        User validUser = null;

        for (User user : AllowedUsers)
        {
            if (user.getUsername().equals(username))
            {
                if (user.getPassword().equals(password))
                {
                    validUser = new User(username, null); 
                }
            }
        }
        return validUser;
    }

}
