public class PersonalInformation {
    private String name;
    private String family;
    private int age;

    ///////////////////////////// constructors
    public PersonalInformation () {}

    ///////////////////////////// setters
    public void setName (String n)
    {
        this.name = n ;
    }

    public void setFamily (String f)
    {
        this.family = f ;
    }

    public void setAge (int a)
    {
        this.age = a ;
    }

    ////////////////////////////// getters
    public String getName ()
    {
        return this.name;
    }

    public String getFamily ()
    {
        return this.family;
    }

    public int getAge ()
    {
        return this.age;
    }

    /////////////////////////////// methods
    public void repetition ( PersonalInformation temp) throws Exception
    {
        if (this.name.equals(temp.name) && this.family.equals(temp.family) && this.age==temp.age)
        {
            throw new Exception("Error : You have entered a duplicate user! ");
        }
    }
}
