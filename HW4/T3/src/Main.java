import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CheckString str = new CheckString();

        System.out.println("Please enter a String to know it contains number or not (If not it's return the length of String) : ");
        str.setStr(input.nextLine());
        try {
            System.out.println("Result : " + str.searchForNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
