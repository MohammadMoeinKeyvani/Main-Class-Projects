import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map map = new HashMap ();
        System.out.print("Please enter your student Id : ");
        map.put("studentid",input.nextLong());
        System.out.print("Please enter your score : ");
        map.put("score",input.nextInt());
        System.out.print("Please enter your name : ");
        map.put("name",input.next());


        for (Object n : map.values())
        {
            System.out.println(n);
        }
    }
}
