import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter n: ");
        int n=input.nextInt();
        int arr []=new int [n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Number"+(i+1));
            arr[i]=input.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>temp)
            {
                temp=arr[i];
            }
        }
        System.out.println("Maximum Number is : "+temp);
    }//end of main
}//end of class
