public class User {
    private String name;
    private String userName;
    private String passWord;
    private String email;

    //////////////////////////////// constructor
    public User() {
        this.name = "";
        this.userName = "";
        this.passWord = "";
        this.email = "";
    }

    /////////////////////////////// setters & getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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