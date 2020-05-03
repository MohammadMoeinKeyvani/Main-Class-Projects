import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student std = new Student();

        System.out.print("Please enter your name : ");
        std.setStudentName(input.nextLine());
        System.out.print("Please enter your student Id : ");
        std.setStudentId(input.nextLine());
        System.out.print("Please enter your father's name : ");
        std.setStudentFatherName(input.nextLine());

        System.out.println("Please enter your 5 lessons score : ");
        List<String> scorelist = new ArrayList<>();
        System.out.print("1-  ");
        scorelist.add(input.next());
        System.out.print("2-  ");
        scorelist.add(input.next());
        System.out.print("3-  ");
        scorelist.add(input.next());
        System.out.print("4-  ");
        scorelist.add(input.next());
        System.out.print("5-  ");
        scorelist.add(input.next());

        System.out.println("You entered : ");

        for (String s : scorelist)
        {
            System.out.println(s);
        }
    }
}
