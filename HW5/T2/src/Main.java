import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Users user1 = new Users();

        System.out.print("User Name : ");
        user1.setUserName(input.next());
        System.out.print("PassWord : ");
        user1.setPassWord(input.next());
        System.out.print("Email : ");
        user1.setEmail(input.next());

        System.out.println("User name that you entered : " + user1.getUserName());
        System.out.println("PassWord that you entered : " + user1.getPassWord());
        System.out.println("Email that you entered : " + user1.getEmail());

        try {
            Users user2 = (Users) user1.clone ();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try {
            Users user3 = (Users) user1.clone ();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try {
            Users user4 =(Users) user1.clone ();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
