public class Employees {
    private int employeeCode;
    private String name;
    private String meliCode;
    private String fatherName;
    private String employeeSide;
    private String income;
    private String experience;

    ///////////////////////////// constructors
    public Employees() {
        this.employeeCode = 0;
        this.name = "";
        this.meliCode = "";
        this.fatherName = "";
        this.employeeSide = "";
        this.income = "";
        this.experience = "";
    }

    ////////////////////////////// setters & getters
    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeliCode() {
        return meliCode;
    }

    public void setMeliCode(String meliCode) {
        this.meliCode = meliCode;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEmployeeSide() {
        return employeeSide;
    }

    public void setEmployeeSide(String employeeSide) {
        this.employeeSide = employeeSide;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

}
