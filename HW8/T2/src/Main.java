import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String na,fa,me,ph,mo = "",sttoint;
        int temp;
        Controller c = new Controller();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        na=input.nextLine();
        System.out.print("Enter your Family : ");
        fa=input.nextLine();
        System.out.print("Enter your MeliCode : ");
        me=input.nextLine();
        System.out.print("Enter your PhoneNumber : ");
        ph=input.nextLine();


        System.out.println("Which model do you want : ");
        System.out.println("1. Pride");
        System.out.println("2. Samand");
        System.out.println("3. Peugeot 405");
        System.out.println("4. Peugeot 206");
        sttoint=input.nextLine();
        temp=Integer.parseInt(sttoint);
        if (temp == 1)
        {
            mo = "Pride";
        }
        else if (temp == 2)
        {
            mo = "Samand";
        }
        else if (temp == 3)
        {
            mo = "Peugeot 405";
        }
        else if (temp == 4)
        {
            mo = "Peugeot 206";
        }

        c.insert(na,fa,me,ph,mo);

        System.out.println("Pas bash ta biarim mashin ro behet tahvil bedim :)) ");
    }
}
