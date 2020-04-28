import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EquationSolver es = new EquationSolver();
        String temp;

        System.out.println("Equation Form : ax^2+bX+c=0 \n");
        System.out.print("Please enter a : ");
        temp = input.next();
        es.setA(Integer.parseInt(temp));
        System.out.print("Please enter b : ");
        temp = input.next();
        es.setB(Integer.parseInt(temp));
        System.out.print("Please enter c : ");
        temp = input.next();
        es.setC(Integer.parseInt(temp));

        try {
            System.out.println("Delta is " + es.delta());
            System.out.println("Answers : ");
            es.answers();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }


    }
}
