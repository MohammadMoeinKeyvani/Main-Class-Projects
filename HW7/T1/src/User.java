public class User {
    private String userCode;
    private String userName;
    private String passWord;
    private String email;
    private String degree;
    private String age;

    //////////////////////////////// constructor
    public User() {
        this.userCode = "";
        this.userName = "";
        this.passWord = "";
        this.email = "";
        this.degree = "";
        this.age = "";
    }

    /////////////////////////////// setters & getters
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

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}