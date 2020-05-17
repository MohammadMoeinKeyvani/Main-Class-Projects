public class CarInfoFactory {
    public static Car getCar(int c)
    {
        switch (c)
        {
            case 1:
                return new BMW ();
            case 2:
                return new Benz ();
            case 3:
                return new Ferrari ();
            case 4:
                return new Toyota ();
            default:
                return null;
        }
    }
}
