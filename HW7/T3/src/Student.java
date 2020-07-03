public class Student {
    private int studentId;
    private String name;
    private int year;
    private int average;

    ///////////////////////////// constructor
    public Student() {
        this.studentId = 0;
        this.name = "";
        this.year = 0;
        this.average = 0;
    }

    ///////////////////////////// setters & getters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

}
