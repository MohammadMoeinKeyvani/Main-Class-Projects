public class Student<T> {
    private T studentId;
    private T studentName;
    private T studentFatherName;

    //////////////////////////// constructor
    public Student () {}

    /////////////////////////// setters & getters
    public T getStudentId() {
        return studentId;
    }

    public void setStudentId(T studentId) {
        this.studentId = studentId;
    }

    public T getStudentName() {
        return studentName;
    }

    public void setStudentName(T studentName) {
        this.studentName = studentName;
    }

    public T getStudentFatherName() {
        return studentFatherName;
    }

    public void setStudentFatherName(T studentFatherName) {
        this.studentFatherName = studentFatherName;
    }
}
