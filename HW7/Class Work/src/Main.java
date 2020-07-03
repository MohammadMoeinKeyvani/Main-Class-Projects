import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user1 = new User();
        String tempusername , temppassword;

        System.out.print("Please enter your Name : ");
        user1.setName(input.nextLine());
        System.out.print("Please enter your UserName : ");
        user1.setUserName(input.nextLine());
        System.out.print("Please enter your PassWord : ");
        user1.setPassWord(input.nextLine());
        System.out.print("Please enter your Email : ");
        user1.setEmail(input.nextLine());



        try (Connection connection = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "classwork7",
                "123")) {
            Class.forName ("oracle.jdbc.driver.OracleDriver");

            connection.setAutoCommit (false);
            PreparedStatement preparedStatement = connection.prepareStatement ("insert into users (name,username,password,email) values (?,?,?,?)");
            preparedStatement.setString (1, user1.getName());
            preparedStatement.setString (2, user1.getUserName());
            preparedStatement.setString (3, user1.getPassWord());
            preparedStatement.setString (4, user1.getEmail());
            preparedStatement.executeUpdate();



            System.out.println("\n\rLOGIN ");
            System.out.print("UserName : ");
            tempusername = input.nextLine();
            System.out.print("PassWord : ");
            temppassword = input.nextLine();


            PreparedStatement login = (PreparedStatement) connection
                    .prepareStatement("Select name, password from users where username=? and password=?");

            login.setString(1, tempusername);
            login.setString(2, temppassword);
            ResultSet rs = login.executeQuery();
            if (rs.next()) {
                System.out.println("You have successfully logged in");
            } else {
                System.out.println("Wrong Username & Password");
            }


            connection.commit ();

        } catch (ClassNotFoundException e)// if no lib files are added
        {
            System.out.println ("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println ("DB ERROR " + e.getMessage ());
        }



    }//end of mian
}//end of class
