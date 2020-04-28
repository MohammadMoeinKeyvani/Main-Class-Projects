public class User {
    private String name;
    private String userName;
    private String passWord;

    ////////////////////////// constructors
    public User () {}

    ////////////////////////// setters
    public void setName(String n)
    {
        this.name=n;
    }

    public void setUserName(String un)
    {
        this.name=un;
    }

    public void setPassWord(String p)
    {
        this.name=p;
    }

    ///////////////////////// getters
    public String getName ()
    {
        return this.name;
    }

    public String getUserNameName ()
    {
        return this.userName;
    }

    public String getPassWord ()
    {
        return this.passWord;
    }

    ////////////////////////// methods
    public void checkName () throws Exception
    {
        if (name.equals("Mohammad"))
            System.out.println("Name that you entered is right .");
        else
            throw new Exception("Invalid Name!!");
    }

    public void checkUserName () throws Exception
    {
        if (name.equals("Mamad"))
            System.out.println("UserName that you entered is right .");
        else
            throw new Exception("Invalid User Name!!");
    }

    public void checkPassWord () throws Exception
    {
        if (name.equals("123456"))
            System.out.println("PassWord that you entered is right .");
        else
            throw new Exception("Invalid PassWord!!");
    }
}
