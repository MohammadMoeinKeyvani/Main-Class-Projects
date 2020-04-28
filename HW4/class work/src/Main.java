import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersonalInformation [] person = new PersonalInformation[2];
        person [0] = new PersonalInformation();
        person [1] = new PersonalInformation();
        String temp;

        for (int i = 0 ; i<2 ; i++)
        {
            System.out.println("Please enter name : ");
            person [i].setName(input.next());
            System.out.println("Please enter family : ");
            person [i].setFamily(input.next());
            System.out.println("Please enter age : ");
            temp=input.next();
            person [i].setAge(Integer.parseInt(temp));
        }
        try {
            person [0].repetition(person [1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
