import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User u = new User();

       // System.out.println("Status : ");
        try {
            System.out.println("Please enter your name : ");
            u.setName(input.nextLine());
            u.checkName();
            System.out.println("Please enter your user name : ");
            u.setUserName(input.nextLine());
            u.checkUserName();
            System.out.println("Please enter your password : ");
            u.setPassWord(input.nextLine());
            u.checkPassWord();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
