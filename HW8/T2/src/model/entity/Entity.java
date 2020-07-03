package model.entity;

public class Entity {
    private String name;
    private String family;
    private String meliCode;
    private String phoneNumber;
    private String model;

    public Entity() {
        this.name = "";
        this.family = "";
        this.meliCode = "";
        this.phoneNumber = "";
        this.model = "";
    }

    public String getName() {
        return name;
    }

    public Entity setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Entity setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getMeliCode() {
        return meliCode;
    }

    public Entity setMeliCode(String meliCode) {
        this.meliCode = meliCode;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Entity setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Entity setModel(String model) {
        this.model = model;
        return this;
    }
}
