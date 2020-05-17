import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your : user name,name,password,age,address,phone number,grade (in order)");
        User user = new User().setUserName(input.nextLine()).setName(input.nextLine()).setPassWord(input.nextLine()).setAge(input.nextLine()).setAddress(input.nextLine()).setPhoneNumber(input.nextLine()).setGrade(input.nextLine());
    }
}
