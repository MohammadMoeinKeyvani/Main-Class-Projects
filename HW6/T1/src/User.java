public class User {
    private String userName;
    private String name;
    private String passWord;
    private String age;
    private String address;
    private String phoneNumber;
    private String grade;

    ///////////////////////////////// constructor
    public User () {}

    ///////////////////////////////// setters & getters
    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassWord() {
        return passWord;
    }

    public User setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }

    public String getAge() {
        return age;
    }

    public User setAge(String age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getGrade() {
        return grade;
    }

    public User setGrade(String grade) {
        this.grade = grade;
        return this;
    }
}
