import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Equation equ=new Equation();
        System.out.println("Enter Coefficient of x for first equation : ");
        equ.a=input.nextFloat();
        System.out.println("Enter Coefficient of y for first equation : ");
        equ.b=input.nextFloat();
        System.out.println("Enter Constant for first equation : ");
        equ.e=input.nextFloat();

        System.out.println("Enter Coefficient of x for second equation : ");
        equ.c=input.nextFloat();
        System.out.println("Enter Coefficient of y for second equation : ");
        equ.d=input.nextFloat();
        System.out.println("Enter Constant for second equation : ");
        equ.f=input.nextFloat();


        equ.result();
    }
}
