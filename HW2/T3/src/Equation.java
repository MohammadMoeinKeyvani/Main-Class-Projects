public class Equation {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    public void result ()
    {
        if(((this.a*this.d)-(this.b*this.c))==0)
        {
            System.out.println("Can't solve this equation.");
        }
        else
        {
            float x=((this.e*this.d)-(this.b*this.f))/((this.a*this.d)-(this.b*this.c));
            float y=((this.a*this.f)-(this.e*this.c))/((this.a*this.d)-(this.b*this.c));
            System.out.println("The value of X is equal to = "+x);
            System.out.println("The value of Y is equal to = "+y);
        }


    }

}//end of class
