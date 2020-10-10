package models;

public class User
{

    String userName;
    String pass;

    public User(String user, String pass)
    {
        this.userName = user;
        this.pass = pass;
    }

    public String getUsername()
    {
        return userName;
    }

    public String getPassword()
    {
        return pass;
    }
}
