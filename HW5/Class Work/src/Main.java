import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Information in = new Information();
        String temp;

        System.out.print("Please enter your name : ");
        in.setName(input.nextLine());
        System.out.print("Please enter your family : ");
        in.setFamily(input.nextLine());
        System.out.print("Please enter your pass : ");
        temp = input.nextLine();
        in.setPass(temp);
        System.out.print("Please enter your UserName : ");
        in.setUserName(input.nextLine());
        System.out.print("Please enter your job : ");
        in.setJob(input.nextLine());
        System.out.print("Please enter your age : ");
        temp = input.next();
        in.setAge(Integer.parseInt(temp));


        System.out.println("\n \rYou entered : ");
        System.out.println(in.getName());
        System.out.println(in.getFamily());
        System.out.println(in.getPass());
        System.out.println(in.getUserName());
        System.out.println(in.getJob());
        System.out.println(in.getAge());
    }
}
