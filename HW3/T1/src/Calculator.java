public class Calculator {
    private long firstNumber;
    private long secondNumber;

    //////////////////////////////////// constructor
    public Calculator () {}

    //////////////////////////////////// setters
    public void setFirstNumber (long num1) {
        this.firstNumber = num1;
    }

    public void setSecondNumber (long num2) {
        this.secondNumber = num2;
    }

    //////////////////////////////////// getters
    public long getFirstNumber () {
        return firstNumber;
    }

    public long getSecondNumber () {
        return secondNumber;
    }

    //////////////////////////////////// methods
    public long toAdd () {
        long addUp = this.firstNumber + this.secondNumber;
        return addUp;
    }

    public long toSubtract () {
        long sub = this.firstNumber - this.secondNumber;
        return sub;
    }

    public long toMultiply ()
    {
        long mul= this.firstNumber * this.secondNumber;
        return mul;
    }

    public long toDivide ()
    {
        long div=this.firstNumber/this.secondNumber;
        return div;
    }
}
