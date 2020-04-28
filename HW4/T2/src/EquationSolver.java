public class EquationSolver {
    private int a;
    private int b;
    private int c;

    ////////////////////////// setters
    public void setA (int na)
    {
        this.a = na;
    }

    public void setB (int nb)
    {
        this.b = nb;
    }

    public void setC (int nc)
    {
        this.c = nc;
    }

    /////////////////////////// getters
    public int getA ()
    {
        return this.a;
    }

    public int getB ()
    {
        return this.b;
    }

    public int getC ()
    {
        return this.c;
    }

    ////////////////////////// methods
    public int delta () throws Exception
    {
        int d=b*b-4*a*c;
        if (d>=0)
            return d;
        else
            throw new Exception("Can't solve this equation.");
    }

    public void answers () throws Exception {
        double x1= (-b+Math.sqrt(delta()))/(2*this.a);
        double x2= (-b-Math.sqrt(delta()))/(2*this.a);
        System.out.println("x1 : "+ x1);
        System.out.println("x2 : "+ x2);
    }
}
