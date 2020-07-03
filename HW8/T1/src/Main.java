import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String un,pa,sttoint;
        int tr,pr,temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username : ");
        un=input.nextLine();
        System.out.print("Enter your password : ");
        pa=input.nextLine();

        Controller c = new Controller();
        c.insert(un,pa);

        System.out.println("\n\rLOGIN !!");
        System.out.print("Enter your username : ");
        un=input.nextLine();
        System.out.print("Enter your password : ");
        pa=input.nextLine();

        if ((c.searchUserName(un) && c.searchPassWord(pa)) == true)
            System.out.println("LOGIN SUCCESSFUL.");
        else
            System.out.println("LOGIN FAILED.");

        System.out.println("Please select one.");
        System.out.println("1.2  GB - 1000  Toman");
        System.out.println("2.4  GB - 2000  Toman");
        System.out.println("3.10 GB - 5000  Toman");
        System.out.println("4.25 GB - 10000 Toman");
        sttoint=input.nextLine();
        temp=Integer.parseInt(sttoint);
        if (temp == 1)
        {
            c.buy(2,1000);
        }
        else if (temp == 2)
        {
            c.buy(4,2000);
        }
        else if (temp == 3)
        {
            c.buy(10,5000);
        }
        else if (temp == 4)
        {
            c.buy(25,10000);
        }

    }
}
