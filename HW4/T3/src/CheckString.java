public class CheckString {
    private String str;

    ///////////////////////// constructors
    public CheckString() {
    }

    //////////////////////// setters
    public void setStr(String s) {
        this.str = s;
    }

    //////////////////////// getters
    public String getStr() {
        return this.str;
    }

    //////////////////////// methods
    public int searchForNumber() throws Exception
    {
        for (int i = 0;i < str.length() ;i++)
        {
            if (str.charAt(i)<=57 && str.charAt(i)>=48)
            {
                throw new Exception("You entered an String that contains Number !!");
            }
        }
        return str.length();
    }
}
