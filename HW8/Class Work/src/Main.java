import controller.UserController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String n,un,p,e;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        n=input.nextLine();
        System.out.print("Enter your username : ");
        un=input.nextLine();
        System.out.print("Enter your password : ");
        p=input.nextLine();
        System.out.print("Enter your email : ");
        e=input.nextLine();

        UserController uc = new UserController();
        uc.insert(n,un,p,e);

        System.out.println("\n\rLOGIN !!");
        System.out.print("Enter your username : ");
        un=input.nextLine();
        System.out.print("Enter your password : ");
        p=input.nextLine();

        if ((uc.searchUserName(un) && uc.searchPassWord(p)) == true)
            System.out.println("LOGIN SUCCESSFUL.");
        else
            System.out.println("LOGIN FAILED.");
    }
}
