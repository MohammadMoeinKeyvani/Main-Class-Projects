package model.entity;

public class Employee {
    private String name;
    private String family;
    private String fatherName;
    private String number;
    private int age;

    public Employee() {
        this.name = "";
        this.family = "";
        this.fatherName = "";
        this.number = "";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Employee setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Employee setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Employee setNumber(String number) {
        this.number = number;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }
}
