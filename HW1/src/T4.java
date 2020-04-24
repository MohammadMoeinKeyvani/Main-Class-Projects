import java.util.Scanner;

public class T4 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int len=input.nextInt();
        int arr []=new int [len];
        for (int i=0;i<len;i++)
        {
            System.out.println("Enter "+(i+1)+" number :");
            arr[i]=input.nextInt();
        }
        System.out.println("Enter n :");
        int n=input.nextInt();
        int counter=0;
        boolean find =false;
        for (int i=0;i<len;i++)
        {
            if (arr [i]==n)
            {
                counter++;
                find=true;
            }
        }
        System.out.println("Is n Finded ?? "+find);
        if(counter>0)
            System.out.println("Number of loop : "+counter);
    }//end of main
}//end of class
