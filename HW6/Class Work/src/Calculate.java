public class Calculate {
    private char operator;
    private int firstNumber;
    private int secondNumber;


    /////////////////////////////// constructor
    public Calculate () {}

    /////////////////////////////// setters & getters
    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    //////////////////////////////// methods
    public int calculate ()
    {
        if (operator == '-')
            return new CalcMinus().calc(this.firstNumber , this.secondNumber);
        else if (operator == '+')
            return new CalcPlus().calc(this.firstNumber , this.secondNumber) ;
        else
            return -1;
    }


}
