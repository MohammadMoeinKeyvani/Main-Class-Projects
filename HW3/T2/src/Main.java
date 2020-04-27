import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lesson les = new Lesson();

        while (1==1)
        {
            System.out.print("Enter name of lesson that you want (You can choose : advanced programming , mathmatics 2 , physics 2 or if you want to exit type anything) : ");
            les.setLessonName(input.nextLine());
            if (!(les.getLessonName().equals("advanced programming") || les.getLessonName().equals("mathmatics 2") || les.getLessonName().equals("physics 2")))
                break;
            System.out.println(les.getLessonName() + " =>>    Number of Unit : " + les.numberOfUnit() + " , Pishniaz : " + les.pishNiaz() + " , Hamniaz : " + les.hamNiaz());

        }

    }
}
