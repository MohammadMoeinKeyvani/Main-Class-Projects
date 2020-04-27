public class Int implements MyInteger{
    private int number;

    ////////////////////////////////// constructors
    public Int() {}

    ////////////////////////////////// setters
    public void setNumber (int n)
    {
        this.number = n;
    }

    ////////////////////////////////// getters
    public int getNumber ()
    {
        return this.number;
    }

    /////////////////////////////////// methods
    @Override
    public String isEven() {
        if (this.number%2==0)
            return "it's even.";
        else
            return "it's not even.";
    }

    @Override
    public String isOdd() {
        if (this.number%2!=0)
            return "it's odd.";
        else
            return "it's not odd.";
    }

    @Override
    public String isPosetive() {
        if (this.number>0)
            return "it's Posetive.";
        else
            return "it's not Posetive.";
    }

    @Override
    public String isNegative() {
        if (this.number<0)
            return "it's Negative.";
        else
            return "it's not Negative.";
    }

    @Override
    public String isZero() {
        if (this.number==0)
            return "it's Zero.";
        else
            return "it's not Zero.";
    }
}
