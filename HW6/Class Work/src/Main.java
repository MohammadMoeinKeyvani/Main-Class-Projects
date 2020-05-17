import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mathmaticPhrase ;
        Calculate test = new Calculate();

        System.out.println("Enter mathmatic phrase that you want (example : 4+3) : ");
        mathmaticPhrase = input.next();
        test.setOperator(mathmaticPhrase.charAt(1));
        test.setFirstNumber(Integer.parseInt(String.valueOf(mathmaticPhrase.charAt(0))));
        test.setSecondNumber(Integer.parseInt(String.valueOf(mathmaticPhrase.charAt(2))));

    }
}
