package nl.royvball19.zorgappfx;

public class Person
{

    // Attributes
    private int ID;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private boolean employee;

    // Constructor
    public Person(int ID,String userName, String password, String firstName, String lastName, int age, boolean employee)
    {
        this.ID = ID;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employee = employee;
    }

    // Getters
    public int getID()
    {
        return this.ID;
    }

    public String getUserName()
    {
        return this.userName;
    }

    public String getPassword()
    {
        return this.password;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public int getAge()
    {
        return this.age;
    }

    public boolean getEmployee()
    {
        return  this.employee;
    }


    // Setters
    public void setID(int ID)
    {
        this.ID = ID;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setFirstName(String firstname)
    {
        this.firstName = firstname;
    }

    public void setLastName(String lastname)
    {
        this.lastName = lastname;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setEmployee(boolean employee)
    {
        this.employee = employee;
    }
}