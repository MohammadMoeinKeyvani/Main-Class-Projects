package model.entity;

public class Entity {
    private String userName;
    private String passWord;
    private String name;
    private String age;

    public Entity() {
        this.userName = "";
        this.passWord = "";
        this.name = "";
        this.age = "";
    }


    public String getUserName() {
        return userName;
    }

    public Entity setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassWord() {
        return passWord;
    }

    public Entity setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }

    public String getName() {
        return name;
    }

    public Entity setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Entity setAge(String age) {
        this.age = age;
        return this;
    }
}
