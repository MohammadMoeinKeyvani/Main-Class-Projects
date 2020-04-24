import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1=input.nextInt();
        System.out.println("Enter second number : ");
        int n2=input.nextInt();
        int temp;
        if(n1>n2)
        {
            temp=n1;
            n1=n2;
            n2=temp;
        }
        for(;;)
        {
            System.out.println("Enter number that You want : 1.Sum 2.Subtraction 3.Multiply 4.Division 5.Exit");
            int choice = input.nextInt();
            if(choice==5)
                break;
            switch (choice) {
                case 1:
                    System.out.println(n1 + n2);
                    break;
                case 2:
                    System.out.println(n2 - n1);
                    break;
                case 3:
                    System.out.println(n2 * n1);
                    break;
                case 4:
                    System.out.println(n2 / n1);
                    break;
            }
        }
    }//end of main
}//end of class
