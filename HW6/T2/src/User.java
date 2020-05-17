public class User {
    private String userName;
    private String passWord;
    private String email;

    private static User user = new User();
    public static User getInstance()
    {
        return user;
    }

    ////////////////////////////// constructor
    private User () {}

    ////////////////////////////// setters & getters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
