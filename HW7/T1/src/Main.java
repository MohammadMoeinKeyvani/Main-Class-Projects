import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user1 = new User();
        String sttoint;
        int temp;

        System.out.print("Please enter your usercode : ");
        user1.setUserCode(input.nextLine());
        System.out.print("Please enter your UserName : ");
        user1.setUserName(input.nextLine());
        System.out.print("Please enter your Email : ");
        user1.setEmail(input.nextLine());
        System.out.print("Please enter your PassWord : ");
        user1.setPassWord(input.nextLine());
        System.out.print("Please enter your Age : ");
        user1.setAge(input.nextLine());
        System.out.print("Please enter your Degree : ");
        user1.setDegree(input.nextLine());



        try (Connection connection = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "classwork7",
                "123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into updatableusers (usercode,username,email,password,age,degree) values (?,?,?,?,?,?)");
            preparedStatement.setString(1, user1.getUserCode());
            preparedStatement.setString(2, user1.getUserName());
            preparedStatement.setString(3, user1.getEmail());
            preparedStatement.setString(4, user1.getPassWord());
            preparedStatement.setString(5, user1.getAge());
            preparedStatement.setString(6, user1.getDegree());



            System.out.println("\n\rDo you want update your information ?? 1.Yes 2.No ");
            sttoint = input.nextLine();
            temp = Integer.parseInt(sttoint);
            if (temp == 1) {
                System.out.print("Please enter your usercode : ");
                user1.setUserCode(input.nextLine());
                System.out.print("Please enter your UserName : ");
                user1.setUserName(input.nextLine());
                System.out.print("Please enter your Email : ");
                user1.setEmail(input.nextLine());
                System.out.print("Please enter your PassWord : ");
                user1.setPassWord(input.nextLine());
                System.out.print("Please enter your Age : ");
                user1.setAge(input.nextLine());
                System.out.print("Please enter your Degree : ");
                user1.setDegree(input.nextLine());
            }


            preparedStatement.setString(1, user1.getUserCode());
            preparedStatement.setString(2, user1.getUserName());
            preparedStatement.setString(3, user1.getEmail());
            preparedStatement.setString(4, user1.getPassWord());
            preparedStatement.setString(5, user1.getAge());
            preparedStatement.setString(6, user1.getDegree());
            preparedStatement.executeUpdate();



            connection.commit ();

        } catch (ClassNotFoundException e)
        {
            System.out.println ("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println ("DB ERROR " + e.getMessage ());
        }



    }//end of mian
}//end of class
