import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your username : ");
        User.getInstance().setUserName(input.nextLine());
        System.out.print("Please enter your password : ");
        User.getInstance().setPassWord(input.nextLine());
        System.out.print("Please enter your email : ");
        User.getInstance().setEmail(input.nextLine());

        System.out.println("You entered : " + User.getInstance().getUserName() + " , " + User.getInstance().getPassWord() + " , " + User.getInstance().getEmail());

    }
}
