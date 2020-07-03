package model.entity;

public class Entity {
    private String userName;
    private String passWord;
    private int traffic;
    private int price;

    public Entity() {
        this.userName = "";
        this.passWord = "";
        this.traffic = 0;
        this.price = 0;
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

    public int getTraffic() {
        return traffic;
    }

    public Entity setTraffic(int traffic) {
        this.traffic = traffic;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Entity setPrice(int price) {
        this.price = price;
        return this;
    }

}
