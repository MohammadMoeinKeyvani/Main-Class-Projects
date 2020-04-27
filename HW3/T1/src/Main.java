import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        String changer,sign;

        System.out.print("Please enter first number : ");
        changer = input.next();
        calc.setFirstNumber(Long.parseLong(changer));
        System.out.print("Please enter second number : ");
        changer = input.next();
        calc.setSecondNumber(Long.parseLong(changer));

        while (1 == 1)
        {
            System.out.print("What do you want ? (Please enter + , - , * , / or if you want to exit enter other thing) : ");
            sign = input.next();
            if (sign.equals("+"))
                System.out.println(calc.getFirstNumber() + " + " + calc.getSecondNumber() + " = " + calc.toAdd());
            else if (sign.equals("-"))
                System.out.println(calc.getFirstNumber() + " - " + calc.getSecondNumber() + " = " + calc.toSubtract());
            else if (sign.equals("*"))
                System.out.println(calc.getFirstNumber() + " * " + calc.getSecondNumber() + " = " + calc.toMultiply());
            else if (sign.equals("/"))
                System.out.println(calc.getFirstNumber() + " / " + calc.getSecondNumber() + " = " + calc.toDivide());
            else
                break;
        }




    }
}
