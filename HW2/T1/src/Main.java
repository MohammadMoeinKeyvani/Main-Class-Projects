import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Rectangle first=new Rectangle();
        Rectangle second = new Rectangle();
        System.out.println("Enter width of first rectangle : ");
        first.width=input.nextFloat();
        System.out.println("Enter height of first rectangle : ");
        first.height=input.nextFloat();

        System.out.println("Enter width of second rectangle : ");
        second.width=input.nextFloat();
        System.out.println("Enter height of second rectangle : ");
        second.height=input.nextFloat();



        System.out.println("Circumference of first rectangle : "+first.circumference());
        System.out.println("Surface of fist rectangle : "+first.surface());

        System.out.println("Circumference of second rectangle : "+second.circumference());
        System.out.println("Surface of second rectangle : "+second.surface());


    }//end of main
}//end of class
