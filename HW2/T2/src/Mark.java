public class Mark {
    public float mark1;
    public int coefficient1;
    public float mark2;
    public int coefficient2;
    public float mark3;
    public int coefficient3;


    public void average ()
    {
        float avg=((this.mark1*this.coefficient1)+(this.mark2*this.coefficient2)+(this.mark3*this.coefficient3) )/(this.coefficient3+this.coefficient2+this.coefficient1);
        System.out.println("Avarage = "+avg);
        if(avg>12)
            System.out.println("You aren't faild");
        else
            System.out.println("You are faild");
    }

}//end of class
