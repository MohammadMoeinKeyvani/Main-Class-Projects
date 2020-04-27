import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Int i = new Int();
        String temp;
        System.out.print("Please enter a number : ");
        temp = input.next();
        i.setNumber(Integer.parseInt(temp));
        System.out.println("The number that you had entered is : " + i.getNumber() + " and " + i.isEven() + " , " + i.isOdd() + " , " + i.isPosetive() + " , " + i.isNegative() + " , " + i.isZero()  );
    }
}
