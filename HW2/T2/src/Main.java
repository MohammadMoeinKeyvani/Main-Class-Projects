import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mark std = new Mark();

        System.out.print("Enter first mark : ");
        std.mark1=input.nextFloat();
        System.out.print("Enter first coefficient : ");
        std.coefficient1=input.nextInt();

        System.out.print("Enter second mark : ");
        std.mark2=input.nextFloat();
        System.out.print("Enter second coefficient : ");
        std.coefficient2=input.nextInt();

        System.out.print("Enter third mark : ");
        std.mark3=input.nextFloat();
        System.out.print("Enter third coefficient : ");
        std.coefficient3=input.nextInt();

        std.average();



    }

}
