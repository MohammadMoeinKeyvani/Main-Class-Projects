public class Rectangle {
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ property
    public float width;
    public float height;


    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ method
    public float circumference ()
    {
        float result = (this.height+this.width)*2;
        return result;
    }
    public float surface()
    {
        float result =this.height*this.width;
        return result;
    }


}//end of class
